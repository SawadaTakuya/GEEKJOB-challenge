<%-- 
    Document   : nf141
    Created on : 2018/07/27, 11:42:34
    Author     : sawadatakuya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            request.setCharacterEncoding("UTF-8");
            out.println(request.getParameter("namae"));
            out.println(request.getParameter("seibetsu1"));
            out.println(request.getParameter("seibetsu2"));
            out.println(request.getParameter("shumi"));
            
        
        
        
        
        %>
       
    </body>
</html>
