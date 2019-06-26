<%-- 
    Document   : Issue Book
    Created on : Apr 16, 2019, 6:18:37 AM
    Author     : mahmud97
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Issue Book</title>
    </head>
    <body>
        <h1><left>Details of BOOK and Student</left></h1>

        <!--<input type="text" name="answer" required="required">-->
                        
        <form action="issuebook" method="post">
            <table>
                <tr>
                    <td>
                        Book ID :
                    </td>
                    <td>
                        <input type="text" placeholder="Type Book ID" name="book_id"> 
                        <!--<input value="Search"  type="submit" name="Bsearchbtn" required >--> 

                    </td>
                </tr>

                <tr>
                    <td>
                        Name :
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
                        <input type="text" placeholder="Edition" name="book_edition"> 
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










                <!--Details of student-->


                <!--<h1><right>Details of Student </right></h1>-->



                <tr>
                    <td>
                        Student ID :
                    </td>
                    <td>
                        <input type="text" placeholder="Type Sttudent ID" name="s_id"> 
                        <!--<input value="Search"  type="submit" name="Ssearchbtn" required >--> 

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
                        <input type="text" placeholder="Year" name="year"> 
                    </td>
                </tr>

                <tr>
                    <td>
                        Semester:
                    </td>
                    <td>
                        <input type="text" placeholder="Semester" name="semester"> 
                    </td>
                </tr>

                <tr>
                    <td>
                        Date of Issue:
                    </td>
                    <td>
                        <input type="text" placeholder="Date of Issue" name="date_of_issue"> 
                    </td>
                </tr>

                <!--                  <div class="buttonHolder">-->

                <!--
                                 <form action ="">-->
                <tr>


                <input value="Issue"  type="submit" name="Issuebtn" required > 

                <!--                </form>-->
                <!--                    <a href="/login">user</a>
                -->
                <a href="User Panel.jsp">Back</a>
                <!--<input value="Back"  type="submit" name="Backbtn" required>-->
                <!--</div>-->   

                </tr>

            </table>

        </form>




    </body>
</html>