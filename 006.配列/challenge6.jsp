<%-- 
    Document   : challenge6
    Created on : 2018/06/08, 10:34:15
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
     
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<String>data=new ArrayList <String>();
    data.add("10");
    data.add("100");
    data.add("soeda");
    data.add("hayashi");
    data.add("-20");
    data.add("118");
    data.add("END");
    
out.print(data.get(0));
out.print(data.get(1));
out.print(data.get(2));
out.print(data.get(3));
out.print(data.get(4));
out.print(data.get(5));
out.print(data.get(6));


    
 %>
    </body>
</html>
