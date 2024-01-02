package org.galapagos.ex1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ElServlet
 */
@WebServlet("/el")
public class ElServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String> member = new HashMap();
		// 빈 문자열을 키와 값으로 가지는 String 타입의 맴 객체 member를 생성
		member.put("name", "홍길동"); // namer과 userid에 값을 추가
		member.put("userid", "hong");

		// request 스코프에 "member" 라는 속성명으로 지정
		request.setAttribute("member", member);

		RequestDispatcher dis = request.getRequestDispatcher("el02.jsp");
		dis.forward(request, response);

	}

}
