package be_study.quiz.quiz52;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductSampleMain {

	public static void main(String[] args) {
		Product result1 = findProduct(new Product(100, null, -1));
		if (result1 != null) {
			System.out.println(result1.toString());
		}

		System.out.println("-------------------");

		List<Product> result2 = findProductList();
		if (result2 != null) {
			for (Product product : result2) {
				System.out.println(product.toString());
			}
		}
	}

	public static List<Product> findProductList() {
		return findProductList(null);
	}

	public static List<Product> findProductList(Product p) {

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
		String sqlQuery = " select * from product where 1=1 ";
		List<Object> queryParams = new ArrayList<>();

		if (p != null) {
			int p_code = p.getP_code();
			String p_name = p.getP_name();
			int p_price = p.getP_price();

			if (p_code != -1) {
				sqlQuery += "and p_code=? ";
				queryParams.add(p_code);
			}
			if (p_name != null) {
				sqlQuery += "and p_name=? ";
				queryParams.add(p_name);
			}
			if (p_price != -1) {
				sqlQuery += "and p_price=? ";
				queryParams.add(p_price);
			}
		}

		List<Product> productList = null;

		//		쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			for (int i = 0; i < queryParams.size(); i++) {
				psmt.setObject(i + 1, queryParams.get(i));
			}

			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				if (productList == null)
					productList = new ArrayList<>();

				Product product = new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));

				productList.add(product);
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

		return productList;
	}

	public static Product findProduct(Product p) {

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
		String sqlQuery = " select * from product where 1=1 ";
		List<Object> queryParams = new ArrayList<>();

		if (p != null) {
			int p_code = p.getP_code();
			String p_name = p.getP_name();
			int p_price = p.getP_price();

			if (p_code != -1) {
				sqlQuery += "and p_code=? ";
				queryParams.add(p_code);
			}
			if (p_name != null) {
				sqlQuery += "and p_name=? ";
				queryParams.add(p_name);
			}
			if (p_price != -1) {
				sqlQuery += "and p_price=? ";
				queryParams.add(p_price);
			}
		}

		Product product = null;

		//		쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			for (int i = 0; i < queryParams.size(); i++) {
				psmt.setObject(i + 1, queryParams.get(i));
			}

			rs = psmt.executeQuery();

			if (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다

				product = new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
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

		return product;
	}

}
