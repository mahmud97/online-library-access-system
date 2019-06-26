<%-- 
    Document   : AddNewStudent
    Created on : Apr 16, 2019, 3:54:25 PM
    Author     : mahmud97
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <title>Add new Student</title>
    </head>
    <body>
        <h1><left>Add New Student </left></h1>

        <form action="AddNewStudent" method="post">
            <table>
                <tr>
                    <td>
                        Student ID :
                    </td>
                    <td>
                        <input type="text" placeholder="Type Student ID" name="s_id"> 
                       
                    </td>
                </tr>

                <tr>
                    <td>
                        Student Name :
                    </td>
                    <td>
                        <input type="text" placeholder="Student Name" name="s_name"> 
                    </td>
                </tr>


                <tr>
                    <td>
                        Department:
                    </td>
                    <td>
                        <input type="text" placeholder="Department" name="department"> 
                    </td>
                </tr>


                <tr>
                    <td>
                        Year:
                    </td>
                    <td>
                        <input type="text" placeholder="year" name="year"> 
                    </td>
                </tr>

                <tr>
                    <td>
                        Semester:
                    </td>
                    <td>
                        <input type="text" placeholder="Price" name="semester"> 
                    </td>
                </tr>
                <tr>
                <input value="Register"  type="submit" name="Registerbtn" required > 

                <!--                </form>-->
                <!--                    <a href="/login">user</a>
                -->
                <a href="AdminPanel.jsp">Back</a>
                <!--<input value="Back"  type="submit" name="Backbtn" required>-->
                </tr>


                




            </table>
        </form>

    
</html>
