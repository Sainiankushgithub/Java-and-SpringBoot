

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page errorPage="error_page.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Taglib directive tutorial :</h1>
        <hr>
        <h1>
            <c:set var="name" value="Ankush"></c:set>
            <c:out value="${name}"></c:out>
            <!--declaration/declarative tag-->
            <%!
                int a=100;
                int b=10;
                String s=null;
                
                %>
                <%
                    int division =a/b;
                    %>
                    <h1>Division : <%= division%></h1>
                    <h1>length of a string : <%= s.length()%></h1>
        </h1>
        
    </body>
</html>
