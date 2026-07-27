package be_study.quiz.quiz55;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentScoreHakjumDAO {
	public List<StudentScoreHakjumDTO> findStudentScoreHakjumListByDeptno(int deptno) {

		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		//		실행될 쿼리 준비
		//		String sqlQuery = " select profno, name, id, hiredate from professor ";
		String sqlQuery = """
				  select
				  st.studno studno,
				  st.name name,
				  sc.total score,
				  h.grade grade
				  from student st
				  INNER JOIN score sc ON st.studno=sc.studno
				  INNER JOIN hakjum h ON sc.total BETWEEN h.min_point AND h.max_point
				  where st.deptno1=?
				""";

		List<StudentScoreHakjumDTO> sshList = null;

		//		쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, deptno);

			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				StudentScoreHakjumDTO ssh = new StudentScoreHakjumDTO();
				ssh.setStudno(rs.getInt("studno"));
				ssh.setName(rs.getString("name"));
				ssh.setScore(rs.getInt("score"));
				ssh.setGrade(rs.getString("grade"));

				if (sshList == null) {
					sshList = new ArrayList<StudentScoreHakjumDTO>();
				}
				sshList.add(ssh);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return sshList;
	}
}
