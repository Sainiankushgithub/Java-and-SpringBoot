package com.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet2 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>");
        Cookie [] cookies=request.getCookies();
        String name="";
        boolean f=false;
        
        if(cookies==null)
        {
            out.println("Please ! submit your name again.");
        }
        else
        {
            for(Cookie c:cookies)
            {
                String tname=c.getName();
                if(tname.equals("user_name"))
                {
                    f=true;
                    name=c.getValue();
                }
            }
        }
        if(f==true)
        {
        out.println("Hello ! "+name+" welcome to servlet2");
        }
        out.println("</h1>");
        out.println("</body>");
        out.println("</html>");
    }
    
}