<%-- 
    Document   : AddNewBook
    Created on : Apr 16, 2019, 3:48:33 PM
    Author     : mahmud97
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add New Book</title>
    </head>
    <body>
        <h1><left>Add New Book </left></h1>

        <form action="AddNewBook" method=" post">
            <table>
                <tr>
                    <td>
                        Book ID :
                    </td>
                    <td>
                        <input type="text" placeholder="Type Book ID" name="b_id"> 
                        
                    </td>
                </tr>

                <tr>
                    <td>
                        Book Name :
                    </td>
                    <td>
                        <input type="text" placeholder="Name" name="b_name"> 
                    </td>
                </tr>


                <tr>
                    <td>
                        Book Edition:
                    </td>
                    <td>
                        <input type="text" placeholder="Edition" name="edition"> 
                    </td>
                </tr>


                <tr>
                    <td>
                        Publisher:
                    </td>
                    <td>
                        <input type="text" placeholder="Publisher" name="publisher"> 
                    </td>
                </tr>

                <tr>
                    <td>
                        Price:
                    </td>
                    <td>
                        <input type="text" placeholder="Price" name="price"> 
                    </td>
                </tr>

                <tr>
                    <td>
                        Pages:
                    </td>
                    <td>
                        <input type="text" placeholder="Pages" name="pages"> 
                    </td>
                </tr>

                <tr>
                <input value="Add"  type="submit" name="Addbtn" required > 

                <!--                </form>-->
                <!--                    <a href="/login">user</a>
                -->
                <a href="AdminPanel.jsp">Back</a>
                    
                <!--<input value="Back"  type="submit" name="Backbtn" required>-->
                </tr>



            </table>

        </form>


    </body>
</html>
