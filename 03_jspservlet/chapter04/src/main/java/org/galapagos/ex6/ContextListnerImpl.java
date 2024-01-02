package org.galapagos.ex6;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.galapagos.common.JDBCUtill;

/**
 * Application Lifecycle Listener implementation class ContextListnerImpl
 *
 */
@WebListener
public class ContextListnerImpl implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public ContextListnerImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("웹 어플리케이션 제거");
		JDBCUtill.close();
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("웹 어플리케이션 초기화");
		ServletContext sc = sce.getServletContext();

		String driver = sc.getInitParameter("driver");
		String dburl = sc.getInitParameter("dburl");
		String username = sc.getInitParameter("username");
		String password = sc.getInitParameter("password");

		System.out.println(driver);
		System.out.println(dburl);
		System.out.println(username);
		System.out.println(password);

		// JDBC 연결
		try {
			JDBCUtill.connect(driver, dburl, username, password);
			System.out.println("DB 연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
