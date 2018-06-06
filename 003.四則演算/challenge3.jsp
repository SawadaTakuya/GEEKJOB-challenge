<%-- 
    Document   : challenge3
    Created on : 2018/06/06, 17:16:25
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% final int BASE=5; int num2=8;
        
        int result1=BASE*num2  ; 
       int result2=BASE/num2;
       int result3=BASE-num2;
       int result4=BASE+num2;
               
       out.print(result1);
       
       out.print(result2);
       
       out.print(result3);
       
       out.print(result4);
       
       %>
       
       
    </body>
</html>
