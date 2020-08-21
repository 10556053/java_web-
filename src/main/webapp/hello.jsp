<%-- 
    Document   : Hello
    Created on : 2020/7/27, 下午 09:02:11
    Author     : student
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%----
    <%!...%> 用來寫方法函式

--%>
<%!
    double getBmi(double h,double w){
        return w/Math.pow(h/100, 2);
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="SHORTCUT ICON" href="favicon.ico"> 
        <title>hell ya</title>
    </head>
    <body>
        <h1>
            <%
                Double h=170.6;
                Double w = 82.3;
                double bmi = getBmi(h, w);
                out.print(bmi);
            %>
        </h1>
    </body>
</html>
