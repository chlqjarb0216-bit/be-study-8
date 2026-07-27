package be_study.quiz.quiz54;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import be_study.db.v3.DBConnectionManager;

public class StudentDAO {

	public List<StudentDTO> findStudnetList() {
		return findStudnetList(-1);
	}

	public List<StudentDTO> findStudnetList(int grade) {

		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		//		실행될 쿼리 준비
		//		String sqlQuery = " select profno, name, id, hiredate from professor ";
		String sqlQuery = """
				  select *
				  from student
				  where -1=? or grade=?
				""";

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		//		쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, grade);
			psmt.setInt(2, grade);

			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다

				StudentDTO student = new StudentDTO();
				student.setStudno(rs.getInt("studno"));
				student.setName(rs.getString("name"));
				student.setId(rs.getString("id"));
				student.setGrade(rs.getInt("grade"));
				student.setJumin(rs.getString("jumin"));
				student.setBirthday(ConvertDateUtil.convertLocalDateTimeToString(
						ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")), "yyyy-MM-dd"));
				student.setTel(rs.getString("tel"));
				student.setHeight(rs.getInt("height"));
				student.setWeight(rs.getInt("weight"));
				student.setDeptno1(rs.getInt("deptno1"));
				student.setDeptno2(rs.getInt("deptno2"));
				student.setProfno(rs.getInt("profno"));

				studentList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentList;
	}

	public int saveStudent(StudentDTO studentDTO) {

		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		//		실행될 쿼리 준비
		//		String sqlQuery = """
		//				insert into professor
		//				values ( ?, ?, ?, 'position', 100, ?, 0, 0, NULL, NULL )
		//				""";

		String sqlQuery = """
				insert into student
				values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )
				""";
		//		"""
		//		insert into student
		//		values ( ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?, ?, ? )
		//		""";

		int result = 0;

		//		쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, studentDTO.getStudno());
			psmt.setString(2, studentDTO.getName());
			psmt.setString(3, studentDTO.getId());
			psmt.setInt(4, studentDTO.getGrade());
			psmt.setString(5, studentDTO.getJumin());
			psmt.setTimestamp(6, ConvertDateUtil.convertLocalDateTimeToTimestamp(
					ConvertDateUtil.convertDateStringToLocalDateTime(studentDTO.getBirthday())));
			//			psmt.setString(6, studentDTO.getBirthday());
			psmt.setString(7, studentDTO.getTel());
			psmt.setInt(8, studentDTO.getHeight());
			psmt.setInt(9, studentDTO.getWeight());
			psmt.setInt(10, studentDTO.getDeptno1());
			if (studentDTO.getDeptno2() == null) {
				psmt.setNull(11, Types.INTEGER);
			} else {
				psmt.setInt(11, studentDTO.getDeptno2());
			}
			psmt.setInt(12, studentDTO.getProfno());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

}
