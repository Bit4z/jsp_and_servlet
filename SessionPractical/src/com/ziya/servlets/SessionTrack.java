package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTrack extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
res.setContentType("text/html");
PrintWriter out = res.getWriter();

HttpSession session = req.getSession();

Integer count = (Integer)session.getAttribute("snoop.count");
if (count == null)
count = new Integer(1);
else
count = new Integer(count.intValue() + 1);
session.setAttribute("snoop.count", count);

out.println("<HTML><HEAD><TITLE>SessionSnoop</TITLE></HEAD>");
out.println("<BODY><H1>Session Snoop</H1>");

out.println("You've visited this page " + count +
((count.intValue() == 1) ? " time." : " times."));

out.println("<P>");

out.println("<H3>Here is your saved session data:</H3>");
Enumeration e = session.getAttributeNames();
while (e.hasMoreElements()) {
String name = (String) e.nextElement();
out.print("start");
out.println(name + ": " + session.getAttribute(name) + "<BR>");
}

out.println("<H3>Here are some vital stats on your session:</H3>");
out.println("Session id: " + session.getId() +
" <I>(keep it secret)</I><BR>");
out.println("New session: " + session.isNew() + "<BR>");
out.println("Timeout: " + session.getMaxInactiveInterval());
out.println("<I>(" + session.getMaxInactiveInterval() / 60 + 
" minutes)</I><BR>");
out.println("Creation time: " + session.getCreationTime());
out.println("<I>(" + new Date(session.getCreationTime()) + ")</I><BR>");
out.println("Last access time: " + session.getLastAccessedTime());
out.println("<I>(" + new Date(session.getLastAccessedTime()) +
")</I><BR>");

out.println("Requested session ID from cookie: " +
req.isRequestedSessionIdFromCookie() + "<BR>");
out.println("Requested session ID from URL: " +
req.isRequestedSessionIdFromURL() + "<BR>");
out.println("Requested session ID valid: " +
req.isRequestedSessionIdValid() + "<BR>");

out.println("<H3>Test URL Rewriting</H3>");
out.println("Click <A HREF=\"" +
res.encodeURL(req.getRequestURI()) + "\">here</A>");
out.println("to test that session tracking works via URL");
out.println("rewriting even when cookies aren't supported.");

out.println("</BODY></HTML>");
}
}
