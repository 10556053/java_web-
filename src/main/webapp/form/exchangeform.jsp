<%-- 
    Document   : exchangeform
    Created on : 2020/8/3, 下午 08:42:48
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.3/build/pure-min.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>exchange</title>
    </head>
    <body>
        <h1>exchange coin!!!</h1>
        <!--注意， /JavaWeb0727在META-INF看 ， 而/servlet/exchange在相應的SERVLET看-->
        <form class="pure-form" method="post" action ="/JavaWeb0727/servlet/exchange">
            <fieldset>
                <legend>A compact inline form</legend>
                <input type="number",name ="money", placeholder="請輸入幣別(台)" />
                <label for="default-remember">
                    <input type="checkbox" id="default-remember" name = "currency" value="JPY"/>JPY
                    <input type="checkbox" id="default-remember" name = "currency" value="USD"/>USD
                    <input type="checkbox" id="default-remember" name = "currency" value="EUD"/>EUD
                    <input type="checkbox" id="default-remember" name = "currency" value="RMB"/>RMB
                </label>
                <button type="submit" class="pure-button pure-button-primary">Submit</button> 
            </fieldset>
            
        </form>
        
    </body>
</html>
