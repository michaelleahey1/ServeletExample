package com.ust.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "example2", value = "/example2")
public class example2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>GET</h1>");
        out.println("<form action='example2' method='POST'>");
        out.println("Enter a number <input type='text' name='nbr' />");
        out.println("<input type='submit' /></form>");
        out.println("<body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println( "<html><body>");
        out.println( "<h1>POST</h1>");
        String nbrS = request.getParameter( "nbr");
        out.println( "Your number is " + nbrS);
        out.println( "<body></html>");
    }
}
