package edu.kh.servlet.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/coffe") // index.html에 있는 form 태그의 action를 작성하는 것
public class ExampleController3 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String orderer = req.getParameter("orderer");
		String coffee = req.getParameter("coffee");
		String type = req.getParameter("type");
		
		String option = req.getParameter("opt");
		String[] optionArr = req.getParameterValues("opt");
		// req.getParameter("name 속성값")
		// : 같은 name 속성을 가진 여러개 값 중 첫번째 값만 반환
		
		// req.getParameterValues("name 속성값")
		// : 같은 name 속성을 가진 모든 값을 배열(String[])로 반환
		
		System.out.println(orderer);
		System.out.println(coffee);
		System.out.println(type);
		System.out.println(option);
		System.out.println(optionArr); // 주소값
		
		// opt 미선택 시 optionArr == null
		if(optionArr != null) {
			for(String opt : optionArr) {
				System.out.println(opt);
			}
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB_INF/views/result2.jsp");
	}
}
