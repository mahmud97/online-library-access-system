<%-- 
    Document   : index
    Created on : Mar 14, 2019, 5:05:00 PM
    Author     : mahmud97
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <title>Login Form</title>

        <link rel="stylesheet" href="styles_login.css">

    </head>

    <body>
        <div class="login">

            <h2>LOG IN</h2>
            <img src="user.png" class="user">
            
                <form action="login" method="post" >
                
                
                <div class="input-group">
                    <input type="text" name="username" required="required">
                    <span>Username</span>
                </div>
                <div class="input-group">
                    <input type="password" name="password" required="required">
                    <span>Password</span>
                </div>
                <div class="input-group">
                    <!--<form action="login" method="post" >-->
                    
                    <input type="submit" value="Login">
                    <!--</form>-->
                    
                    <!--<form action="Sign Up.jsp">-->
                    
                    <!--<input type="submit" align="center" value="Sign Up">-->
                    <!--</form>-->
                     <a href ="Sign Up.jsp">
                         <center> Sign Up</center>
                    </a>
                    
                    <!--<form action="Forgot.jsp">-->
                    
                    <!--<input type="submit" align="right" value="Forgot Password">-->
                    <!--</form>-->
                    <a href="Forgot.jsp">
                        <center>Forgot</center>
                    </a>
                    
                </div>
                    </form>


            

        </div>
    </body>
</html>