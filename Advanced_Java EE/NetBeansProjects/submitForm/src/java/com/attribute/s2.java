package com.attribute;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class s2 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1>The sum and product are : </h2>");
        
        String n1=request.getParameter("n1");
        String n2=request.getParameter("n2");
        
        int nn1=Integer.parseInt(n1);
        int nn2=Integer.parseInt(n2);
        
        int product=nn1*nn2;
        int sum=(int)request.getAttribute("sum");
        
        out.println("<h1>");
        out.println("sum : "+sum);
        out.println("product : "+product);
        out.println("</h1>");
        
        
    }
}
