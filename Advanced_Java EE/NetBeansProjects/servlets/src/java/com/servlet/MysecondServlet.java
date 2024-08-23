
package com.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MysecondServlet extends GenericServlet{
    @Override
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
    {
        System.out.println("Servicing.................");
        PrintWriter out=resp.getWriter();
        out.println("<h1> This is servlet using generic servlet </h1>");
    }
}
