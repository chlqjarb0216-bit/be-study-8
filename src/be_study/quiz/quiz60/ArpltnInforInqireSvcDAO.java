package be_study.quiz.quiz60;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ArpltnInforInqireSvcDAO {

	public int saveMinuDustWeek(MinuDustWeek minuDustWeek) {

		// db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 실행할 쿼리 준비
		String sqlQuery = " insert into MINU_DUST_WEEK " + " values ( SEQ_MINU_DUST_WEEK_PK.nextval, ?, ?, ?, ?, ? ) ";
		//			? 
		int result = 0;

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			psmt.setString(1, minuDustWeek.getPresnatnDT());
			psmt.setString(2, minuDustWeek.getFrcstOneCn());
			psmt.setString(3, minuDustWeek.getFrcstTwoCn());
			psmt.setString(4, minuDustWeek.getFrcstOneDt());
			psmt.setString(5, minuDustWeek.getFrcstTwoDt());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;

	}
}
