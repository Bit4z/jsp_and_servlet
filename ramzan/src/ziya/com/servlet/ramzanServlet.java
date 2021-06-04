package ziya.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ramzanServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String flag=req.getParameter("Flag");
		
		PrintWriter out=res.getWriter();
		//req.getRequestDispatcher("Data").include(req, res);
		
		
			out.print("Welcome"+flag+"<br>");
			if(flag.equals("India"))
			{

				//out.print("Welcome1"+flag+"<br>");
				req.getRequestDispatcher("India.html").include(req, res);
			}
			else
			{

				out.print("The code is not work");
			}
			
		
		
	}

}
