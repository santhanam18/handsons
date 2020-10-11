package com.ses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Event")
public class Event extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Event() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String eventName=request.getParameter("name");
		HttpSession session = request.getSession();
		session.setAttribute("ename", eventName);
		pw.println("<h1> Event Management System</h1>");
		pw.println("Welcome to this event "+session.getAttribute("ename"));
		pw.println("<form action=\"./EventDesc\" method=\"post\">");
		pw.println(" <input type=\"submit\" value=\"Get Detail\">");
		pw.println("</form>");
		
	}

}
