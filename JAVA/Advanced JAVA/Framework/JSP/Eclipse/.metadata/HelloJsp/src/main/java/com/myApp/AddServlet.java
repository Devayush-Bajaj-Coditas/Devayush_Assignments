package com.myApp;

	import java.io.IOException;
	import java.io.PrintWriter;

	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	public class AddServlet extends HttpServlet{
		
		public void service(HttpServletRequest req, HttpServletResponse res) {
			int a = Integer.parseInt(req.getParameter("A"));
			int b = Integer.parseInt(req.getParameter("B"));
			int sum = a+b;
			try {
				PrintWriter out= res.getWriter();
				out.print("Sum is : "+ sum);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
	}
