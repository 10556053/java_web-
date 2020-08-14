<%-- 
    Document   : add
    Created on : 2020/8/10, 下午 07:11:18
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    int x = Integer.parseInt(request.getAttribute("x")+"");
    int y = Integer.parseInt(request.getAttribute("y")+"");
    int sum = x+y;
    out.print("jsp"+sum);
    request.setAttribute("sum", sum);
%>

