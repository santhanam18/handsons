package com.ses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EventDesc")
public class EventDesc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EventDesc() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<h1> Event Management System</h1>");
		pw.println("<div> Event Rio carnival is planned to held on 2018-09-05 in Rudolfinum</div>");
	}

}
