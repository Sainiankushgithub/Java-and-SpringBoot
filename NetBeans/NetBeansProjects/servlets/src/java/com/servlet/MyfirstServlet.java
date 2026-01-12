
package com.servlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class MyfirstServlet implements Servlet {
    
//    Life Cycle methods 
    
    ServletConfig conf;
    @Override
    public void init(ServletConfig conf)
    {
        this.conf=conf;
        System.out.println("creating objects........");
    }
    @Override
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
    {
        System.out.println("Servicing..............");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>This is my output </h1>");
        out.println("<h1> Today date and time is : "+new Date().toString()+"</h1");
    }
    @Override
    public void destroy()
    {
        System.out.println("going to destroy.........");
    }
    
//    non life cycle methods
    @Override
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    @Override
    public String getServletInfo()
    {
        return "This servelt is created by ankush saini";
    }
}
