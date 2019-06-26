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
        <title>Signup Form</title>

        <link rel="stylesheet" href="styles_signup.css">

    </head>

    <body>
        <div class="login">

            <h2>SIGN UP</h2>
            <img src="user.png" class="user">
            

                <form action="Signup" method="post">
                    
                    <div class="input-group">
                        <input type="text" name="username" required="required">
                        <span>User Name</span>


                    </div>
                    

                    <div class="input-group">
                        <input type="text" name="name" required="required">
                        <span>Name</span>
                    </div>





                    <div class="input-group">
                        <input type="password" name="password" required="required">
                        <span>Password</span>
                    </div>

<!--                    <div class="input-group">
                        <input type="text" name="security_q">
                        
                        <select>
                            <option>Security Questions</option>
                            <option>What is the name of your favorite Book</option>
                            <option>Who is your favorite writer</option>
                            <option>Which language you are comfortable in </option>

                        </select>

                    </div>-->

                    <!--		 <div class="radioContainer">Gender   
                                            <input type="radio">Male 
                                            <input type="radio">Female	
                                    </div>
                    -->

                     <div class="input-group">
                        <input type="text" name="security_q" required="required">
                        <span>Security</span>
                    </div>
    

                    <div class="input-group">
                        <input type="text" name="answer" required="required">
                        <span>Answer</span>
                    </div>




                    <div class="input-group">
                        <input type="submit" value="Signup">
                        <!--<form action="login.jsp">-->
                        
                        
                        <a href="login.jsp">
                            <center>Back</center>   
                        </a>


                        <!--                        <input type="submit" value="Back">
                                                </form>
                        -->

                    </div>
                </form>

                <!--	<a href="#">Already have an account? <span>Sign In</span></a>-->
        </div>
    </body>
</html>