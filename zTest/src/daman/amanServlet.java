package daman;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class amanServlet
 */
@WebServlet("/amanServlet")
public class amanServlet extends HttpServlet {
	
       
	
	    ServletConfig conf;
	    public void init(ServletConfig conf)
	    {
	        this.conf=conf;
	        System.out.println("creating object:.....");
	    }
	    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException{
	        System.out.println("srvicing......");
	    }
	    public void destroy(){
	        System.out.println("going to destroy servlet object");
	    }
	    //non life cycle methods
	    public ServletConfig getServletConfig()
	    {
	        return this.conf;
	    }
	    public String getServletInfo()
	    {
	        return "this servlet is created by durgesh tiwari";
	    }

}
