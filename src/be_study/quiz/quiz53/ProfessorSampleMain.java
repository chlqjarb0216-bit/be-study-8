package be_study.quiz.quiz53;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorSampleMain {

	public static void main(String[] args) {

		List<Professor> resultList = findProfessorListByDeptno(101, true);
		System.out.println("----------------------------------------------");
		if (resultList != null) {
			for (Professor professor : resultList) {
				System.out.println(professor.toString());
			}
		}

	}

	public static List<Professor> findProfessorListByDeptno(int deptno, boolean print) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//		DB 연결 정보

		String db_url = "jdbc:oracle:thin:@localhost:1521/orclpdb";
		String db_id = "scott";
		String db_pw = "tiger";

		//		db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		//		DB 연결

		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//		실행될 쿼리 준비
		String sqlQuery = " select * from professor where deptno=? ";

		List<Professor> professorList = null;

		//		쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, deptno);

			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				//				rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회

				//				데이터가 있다.	

				//				한줄 조회	한 행 데이터
				//				 한 행 데이터 -> Dept 객체 저장
				//				 List<Dept>	.add(Dept)

				//				column 이름(별칭) 기준 조회
				Professor professor = new Professor();

				professor.setProfno(rs.getInt("profno"));
				professor.setName(rs.getString("name"));
				professor.setId(rs.getString("id"));
				professor.setPosition(rs.getString("position"));
				professor.setPay(rs.getInt("pay"));
				professor.setDeptno(rs.getInt("deptno"));

				if (professorList == null)
					professorList = new ArrayList<>();
				professorList.add(professor);
			}

			if (print) {
				if (professorList != null) {
					for (Professor professor : professorList) {
						System.out.println(professor.toString());
					}
				} else {
					System.out.println("조회결과가 존재하지 않습니다.");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//		DB 연결 종료

		try {
			if (rs != null)
				rs.close(); //null 객체 메소드 호출 -> NullPointerException

			if (psmt != null)
				psmt.close();

			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return professorList;
	}

}
