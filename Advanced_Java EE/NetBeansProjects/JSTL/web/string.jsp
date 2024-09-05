<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ! This is a String Manipulation using functions tag</h1>
        
        <!--core tag-->
        
        <c:set var="name" value="Anksuh Saini"></c:set>
        <h1><c:out value="Name : ${name}"></c:out></h1>
        <br>
        <!--functions tag-->
        
        <h1>Legth of Ankush Saini is : <c:out value="${fn:length(name)-1}"></c:out></h1>
    </body>
</html>
