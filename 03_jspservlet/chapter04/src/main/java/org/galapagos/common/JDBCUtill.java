package org.galapagos.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtill {
	static Connection conn = null;

	public static void connect(String driver, String url, String username, String password) throws Exception {

		// jdbc 드라이버 로드
		Class.forName(driver); // 예외 처리 말고 호출하는걸로 던져야함

		// Connection
		conn = DriverManager.getConnection(url, username, password);

	}

	public static Connection getConnection() {
		return conn;
	}

	public static void close() {
		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}