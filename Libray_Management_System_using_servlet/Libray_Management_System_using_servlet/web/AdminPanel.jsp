<%-- 
    Document   : User Panel
    Created on : Apr 16, 2019, 5:44:54 AM
    Author     : mahmud97
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <title>Admin Panel</title>

        <link rel="stylesheet" href="styles_login.css">

    </head>

    <body>
        <div class="login">

            <h2>Admin Panel</h2>
            <img src="user.png" class="user">
                <div class="input-group">
<!--                    <input type="submit" align="left" value="Add New Book">
                    <input type="submit" align="center" value="Add New Student">
                    -->
                    <a href="AddNewBook.jsp"><center>Add New Book</center></a>
                    <a href="AddNewStudent.jsp"><center>Add New Student</center></a>
                    
<!--                    
                    
                    <form action ="welcome.jsp">-->
                        <a href="welcome.jsp"><center>Back</center></a>
                
<!--                    <input type="submit" align="right" value="Back">
                    </form>
                -->
                </div>


            </form>

        </div>
    </body>
</html>