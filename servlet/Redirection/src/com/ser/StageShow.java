package com.ser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StageShow")
public class StageShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public StageShow() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1> New Year Eve </h1>");
		pw.println("<style>");
		pw.println("table,th{ border: 1px solid black; bporder-collapse: collapse;}");
		pw.println("</style>");
		pw.println("<table>");
		pw.println("<tr>");
		pw.println("<th>Name</th>");
		pw.println("<th>New Year Eve </th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>Hall Name</th>");
		pw.println("<th>PVR Lulu Mall</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>Date</th>");
		pw.println("<th>10-10-2020</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>Start Time</th>");
		pw.println("<th>10.00.00</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>End Time</th>");
		pw.println("<th>12.00.00</th>");
		pw.println("</tr>");
		pw.println("</table>");
		pw.close();
	}

}
