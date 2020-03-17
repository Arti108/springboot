package com.niit.webappl;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		
		PrintWriter out = null;
		try {
			out = res.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("HELLO TO SQUARE SERVLET");
		int k=Integer.parseInt(req.getParameter("k"));
		k=k*k;
		out.println("result is:  "+k);
	
		System.out.println("square called");

}
}