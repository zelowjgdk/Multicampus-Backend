package org.galapagos.ex1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.galapagos.vo.Member;

/**
 * Servlet implementation class VoServlet
 */
@WebServlet("/vo")
public class VoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	// Member 객체를 생성하고, 생성된 객체를 "user"라는 이름으로 request 스코프에 설정한 다음,
	// "el03.jsp" 페이지로 포워딩 하는 작엄임

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Member admin = new Member("admin", "관리자"); // admin 변수에 할당

		request.setAttribute("user", admin);
		// user를 request스코프에 설정 -> user라는 이름으로 admin 사용

		RequestDispatcher dis = request.getRequestDispatcher("el03.jsp");
		// el03.jsp로 포워딩 하기 위해 dis 객체 생성
		dis.forward(request, response);

	}

}
