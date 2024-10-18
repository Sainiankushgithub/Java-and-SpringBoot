<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to jstl</h1>
        
        <!--1.out tag-->
        <!--2.set tag-->
        
        <h1>
            <c:set var="i" value="23" scope="application"></c:set>
            <c:out value="${i}"></c:out>
            <br><!-- comment -->
            <c:set var="age" value="21" scope="application"></c:set>
            <c:out value="Your age is : ${age}"></c:out>
            <br>
            <c:remove var="age"></c:remove>
            <c:out value="${age}">But you have removed content of this tag</c:out>
            <hr>
            
            <!--if  cases :-->
            
            <c:if test="${i>20}">
                <h1>Your are under age and you are not allowed !!!!!</h1>
            </c:if>
                
            <!--here we can use switch cases like this : choose , when & otherwise-->
            
            <c:choose>
                <c:when test="${i>20}">
                    <h2>Yes you value is greater than 20 </h2>
                </c:when>
                
                <c:when test="${i<20}">
                    <h2>Your value is less than 20</h2>
                </c:when>
                    
                    <c:otherwise>
                        <h2>your value could not satisfy any of the above</h2>
                    </c:otherwise>
            </c:choose>
                        
                        
            
                  
        </h1>
    </body>
</html>
