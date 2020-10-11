package com.ser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exhibition")
public class Exhibition extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Exhibition() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1> TextFair 2018 expo </h1>");
		pw.println("<style>");
		pw.println("table,th{ border: 1px solid black; bporder-collapse: collapse;}");
		pw.println("</style>");
		pw.println("<table>");
		pw.println("<tr>");
		pw.println("<th>Name</th>");
		pw.println("<th>TextFair 2017 expo</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>Hall Name</th>");
		pw.println("<th>PVR Superplex</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>Start Date</th>");
		pw.println("<th>10-10-2020</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>End Date</th>");
		pw.println("<th>10-10-2030</th>");
		pw.println("</tr>");
		pw.println("</table>");
		pw.close();
	}

}
