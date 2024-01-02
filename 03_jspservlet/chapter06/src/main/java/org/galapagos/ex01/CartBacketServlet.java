package org.galapagos.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartBacketServlet
 */
@WebServlet("/cartbasket")
public class CartBacketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("장바구니 리스트");
		// 세션객체 얻기
		HttpSession session = request.getSession(false);

		if (session != null) {
			session.setMaxInactiveInterval(200);
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("product");
			out.print("상품: " + list + "<br>");

		} else {
			out.print("세션 없음" + "<br>");
		}
		out.print("<a href='product.html'>상품 선택 페이지</a><br>");
		out.print("<a href='cartdelete'>장바구니 비우기</a><br>");
		out.print("</body></html>");
	}

}
