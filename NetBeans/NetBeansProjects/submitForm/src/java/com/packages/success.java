package com.packages;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class success extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h2>Successfully Registered</h2>");
    }
}
