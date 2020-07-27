<%-- 
    Document   : Hello
    Created on : 2020/7/27, 下午 09:02:11
    Author     : student
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
                Date date = new Date();
                out.print(date);
            %>
        </h1>
    </body>
</html>
