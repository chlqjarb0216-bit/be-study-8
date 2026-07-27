package be_study.db.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import be_study.db.v3.DBConnectionManager;

public class DepartmentDAO {

	public DepartmentDTO findDepartmentByDeptno(int deptno) {

		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		//		실행될 쿼리 준비
		//		String sqlQuery = " select profno, name, id, hiredate from professor ";
		String sqlQuery = """
				  select *
				  from department
				  where deptno=?
				""";

		DepartmentDTO departmentDTO = new DepartmentDTO();

		//		쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, deptno);

			rs = psmt.executeQuery();

			if (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				departmentDTO.setDeptno(rs.getInt("deptno"));
				departmentDTO.setDname(rs.getString("dname"));
				departmentDTO.setPart(rs.getInt("part"));
				departmentDTO.setBuild(rs.getString("build"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return departmentDTO;
	}

}
