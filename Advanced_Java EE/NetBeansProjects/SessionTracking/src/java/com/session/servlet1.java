package com.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet1 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>");
        String name = request.getParameter("name");
        out.println("Welcome! "+name+" Hope you are doing well!!!!");
        out.println("<br>");
        out.println("<a href='s2'>Go to servlet2</a>");
        out.println("</h1>");
        Cookie c=new Cookie("user_name",name);
        response.addCookie(c);
        out.println("</body>");
        out.println("</html");
    }
}