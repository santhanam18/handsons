package org.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcome")
public class WelcomeMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public WelcomeMessage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	pw.println("<h1> Welcome to Hall Paradise </h1>");
	pw.println("<p> The type of events are </p>");
	pw.println("<ul> Exhibition </ul>");
	pw.println("<ul> Stage Show </ul>");
	pw.close();
	}

}
