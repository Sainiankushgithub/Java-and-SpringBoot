package com.filter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Myservlet2  extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        try(PrintWriter out=response.getWriter())
        {
            System.out.println("Myservlet2 execution");
            out.println("<h1>");
            out.println("welcome to Servlet2");
            out.println("<br>");
            out.println("Filter is an object which is invoked at the preprocessing and postprocessing of request");
            out.println("Before and After the servlet execution");
            out.println("</h1>");
        }
    }
}
