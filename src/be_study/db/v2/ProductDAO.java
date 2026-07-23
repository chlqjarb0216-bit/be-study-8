package be_study.db.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	public Product findProductByPCode(int pCode) {

		//		db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		//		실행될 쿼리 준비
		String sqlQuery = " select * from product where p_code=? ";

		Product product = null;

		//		쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, pCode);

			rs = psmt.executeQuery();

			if (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				product = new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return product;
	}

	public List<Product> findProductList() {

		//		db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		//		실행될 쿼리 준비
		String sqlQuery = " select * from product ";

		List<Product> productList = null;

		//		쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				Product product = new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));

				if (productList == null) {
					productList = new ArrayList<>();
				}
				productList.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return productList;
	}

}
