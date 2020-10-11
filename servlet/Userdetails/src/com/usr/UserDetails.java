package com.usr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/User")
public class UserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UserDetails() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter pw = response.getWriter();
pw.println("Name:"+request.getParameter("name"));
pw.println("\nPhone No:"+request.getParameter("phno"));
pw.println("\nEmail:"+request.getParameter("email"));
pw.println("\nCity:"+request.getParameter("city"));
pw.close();
	}

}
