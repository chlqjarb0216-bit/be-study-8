package be_study.db.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

	public List<ProfessorDTO> findProffesorList() {

		//		db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		//		실행될 쿼리 준비
		String sqlQuery = " select profno, name, id, hiredate from professor ";

		List<ProfessorDTO> professorList = new ArrayList<ProfessorDTO>();

		//		쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				//				rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회
				//				데이터가 있다.

				ProfessorDTO professor = new ProfessorDTO();
				professor.setProfno(rs.getInt("profno"));
				professor.setName(rs.getString("name"));
				professor.setId(rs.getString("id"));

				//				professor.setHiredate(rs.getDate("hiredate"));
				//				 LocalDateTime <--> java.sql.Date	타입 불일치로 저장 불가

				//				timestamp -> LocalDateTime
				LocalDateTime ldt = ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("hiredate"));
				professor.setHiredate(ldt);

				professorList.add(professor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return professorList;
	}

}
