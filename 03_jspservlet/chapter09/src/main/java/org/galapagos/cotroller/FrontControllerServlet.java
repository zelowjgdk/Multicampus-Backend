package org.galapagos.cotroller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.galapagos.command.Command;
import org.galapagos.command.DetailCommand;
import org.galapagos.command.ListCommand;

/**
 * Servlet implementation class FrontControllerServlet
 */
@WebServlet("*.do")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Map<String, Command> commandMap = new HashMap<>(); // 인터페이스로 코딩

	String prefix = "views/"; // view 이름의 접두어
	String surfix = ".jsp"; // view 일므의 접미어

	public FrontControllerServlet() {
		commandMap.put("/list.do", new ListCommand());
		commandMap.put("/detail.do", new DetailCommand());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());

		System.out.println(requestURI);

		Command cmd = commandMap.get(command);
		String view;

		if (cmd != null) {
			view = cmd.execute(request, response); // view 는 이동할 jsp 파일 경로
		} else { // cmd==null ? ex) ins.do 오타 ==> 404 에러 상황
			view = "404";

		}

		String target = prefix + view + surfix;

		// view로 forwarding
		RequestDispatcher dis = request.getRequestDispatcher(target); // "list.jsp로 forward
		dis.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
