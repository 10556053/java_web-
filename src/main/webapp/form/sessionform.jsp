<%-- 
    Document   : sessionform
    Created on : 2020/8/17, 下午 08:53:45
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.3/build/pure-min.css" integrity="sha384-cg6SkqEOCV1NbJoCu11+bm0NvBRc8IYLRGXkmNrqUBfTjmMYwNKPWBTIKyw9mHNJ" crossorigin="anonymous"> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form class="pure-form">
            <fieldset>
                <a href="/JavaWeb0727/servlet/session/getauth" target="myframe">授權</a>
                <a href="/JavaWeb0727/servlet/session/getreport" target="myframe">報告</a>
                <a href="/JavaWeb0727/servlet/session/cancel" target="myframe">取香</a>
            </fieldset>
        </form>
        <iframe name="myframe" width="500" height="300">
            
        </iframe>
    </body>
</html>
