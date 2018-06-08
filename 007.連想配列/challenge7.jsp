<%-- 
    Document   : challenge7
    Created on : 2018/06/08, 11:32:38
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
        <%@ page import="java.util.HashMap"%>
        
      <%HashMap<String,String>mojidata=new HashMap <String,String>();
      
            
            mojidata.put("1","AAA");
            mojidata.put("hello", "would");
            mojidata.put("soeda","33");
            mojidata.put("20", "20");
            
out.print(mojidata.get("1"));
out.print(mojidata.get("hello"));
out.print(mojidata.get("soeda"));
out.print(mojidata.get("20"));


    
            

                    
      %>              
    </body>
</html>
