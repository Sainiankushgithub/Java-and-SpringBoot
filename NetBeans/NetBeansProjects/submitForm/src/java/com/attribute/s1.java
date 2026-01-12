
package com.attribute;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class s1 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("Welcome to servlet 1");
        
        String n1=request.getParameter("n1");
        String n2=request.getParameter("n2");
        
        int nn1=Integer.parseInt(n1);
        int nn2=Integer.parseInt(n2);
        
        int sum=nn1+nn2;
        request.setAttribute("sum",sum);
        RequestDispatcher rd=request.getRequestDispatcher("s2");
        rd.forward(request, response);
        
    }
}
