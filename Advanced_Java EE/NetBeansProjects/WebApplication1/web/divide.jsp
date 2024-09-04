<%@page errorPage="error2.jsp" %>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Divide</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    
    <body>
        
        <%
            String n1=request.getParameter("n1");
            String n2=request.getParameter("n2");
            
            float a=Integer.parseInt(n1);
            float b=Integer.parseInt(n2);
            
            float divide=(float)(a/b);
        %>
        
        <h1 class="col-6 bg-success-subtle text-center">Result : <%=divide %></h1>
        
    </body>
</html>
