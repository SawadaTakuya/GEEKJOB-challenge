<%-- 
    Document   : challenge6-2
    Created on : 2018/06/08, 10:56:17
    Author     : sawadatakuya
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
<%
    ArrayList<String>data2=new ArrayList<String>();
            
    data2.add("10");
    data2.add("100");
    data2.add("soeda");
    data2.add("hayashi");
    data2.add("-20");
    data2.add("118");
    data2.add("END");
    
    
    data2.set(2,"33");
    
    
    
out.print(data2.get(0));
out.print(data2.get(1));
out.print(data2.get(2));
out.print(data2.get(3));
out.print(data2.get(4));
out.print(data2.get(5));
out.print(data2.get(6));


   
 %>
    </body>
</html>
