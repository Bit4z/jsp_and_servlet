package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class SessionTrack8 extends HttpServlet{
	 public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
     IOException {
   resp.setContentType("text/html");
   PrintWriter out = resp.getWriter();
   HttpSession session = req.getSession(true);
   SessionObject o = new SessionObject(getServletContext());
   session.setAttribute("Binder.object", o);
   out.println("<html>");
   out.println("<head>");
   out.println("<title>Session Binder</title>");
   out.println("</head>");
   out.println("<body>");
   out.println("Object bound to session " + session.getId());

   out.println("</body>");
   out.println("</html>");
   out.flush();
 }
}

class SessionObject implements HttpSessionBindingListener {
 ServletContext context;

 public SessionObject(ServletContext context) {
   this.context = context;
 }

 public void valueBound1(HttpSessionBindingEvent event) {
   context.log("" + (new java.util.Date()) + " Binding " + event.getName() + " to session "
       + event.getSession().getId());
 }

 public void valueUnbound1(HttpSessionBindingEvent event) {
   context.log("" + (new java.util.Date()) + " Unbinding " + event.getName() + " from session "
       + event.getSession().getId());
 }

@Override
public void valueBound(HttpSessionBindingEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void valueUnbound(HttpSessionBindingEvent arg0) {
	// TODO Auto-generated method stub
	
}

}
