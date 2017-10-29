package com.calsy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int a= Integer.parseInt(req.getParameter("number1"));
		int b= Integer.parseInt(req.getParameter("number2"));
		int c= (a/b);
		System.out.println(c);
	}

	
}
 