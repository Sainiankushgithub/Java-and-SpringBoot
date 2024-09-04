<%@page isErrorPage="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  
    </head>
    <body>
        <div class="container">
            <div class="row ">
                <div class="col">
                    <div class="card " style="width: 18rem;">
                        <img src="https://www.shutterstock.com/image-vector/error-message-red-vector-icon-260nw-1184478349.jpg" class="card-img-top " alt="error">
                        <div class="card-body">
                            <ul class="list-group">
                                <li class="list-group-item "><%= exception%></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
