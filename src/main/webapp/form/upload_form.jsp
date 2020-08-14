<%-- 
    Document   : bmiform
    Created on : 2020/7/31, 下午 08:51:49
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.3/build/pure-min.css" integrity="sha384-cg6SkqEOCV1NbJoCu11+bm0NvBRc8IYLRGXkmNrqUBfTjmMYwNKPWBTIKyw9mHNJ" crossorigin="anonymous">
    </head>
    <body style="padding: 20px">

        <form class="pure-form" method="post" 
              enctype="multipart/form-data"
              action="/JavaWeb0727/servlet/upload">
            <fieldset>
                <legend>Upload Form(enctype="multipart/form-data" / 傳送檔案用，最大可夾帶2g)</legend>
                <input type="file" placeholder="file" name="myfile" />
                <input type="text"  name="name" />
                <button type="submit" class="pure-button pure-button-primary">傳送</button>
            </fieldset>
        </form>
    </body>
</html>
