
<%@page import="java.util.Scanner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to my website</h1>
        <!--Declaration (Declarative) tag-->
        <%!
            Scanner sc=new Scanner(System.in);
            int a=5;
            int b=6;
            public int doSum()
{
            return a+b;
}
String name="Ankush";
public String reverseString()
{
StringBuffer br=new StringBuffer(name);

return br.reverse().toString();
}
            %>
            <!--Scriplet tag-->
            
            
            <%
                out.println("<h1>");
                out.println(a);
                out.println("<br>");
                out.println(b);
                out.print("<br>");
                out.println("Sum is : "+doSum());
                out.println("<br>");
                out.println("Reverse of my name : "+reverseString());
                out.println("</h1>");
                %>
                
                <!--Expression tag--> 
                
                <h1>Hii This is heading tag<br> Sum: <%=doSum() %></h1>
    </body>
</html>
