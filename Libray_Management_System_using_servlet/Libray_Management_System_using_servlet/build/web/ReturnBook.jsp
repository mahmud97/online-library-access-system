<%-- 
    Document   : Issue Book
    Created on : Apr 16, 2019, 6:18:37 AM
    Author     : mahmud97
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Return Book</title>
    </head>
    <body>
        <!--<h1><left>Details of Student </left></h1>-->

        <form action="ReturnBook" method="post">
            <table>
                <tr>
                    <td>
                        Student ID :
                    </td>
                    <td>
                        <input type="text" placeholder="Type Student ID" name="s_id"> 
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
                        <input type="text" placeholder="year" name="year"> 
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

                




            

       
        
        
        
        <!--Details of student-->
        
        
         <!--<h1><right>Details of Book </right></h1>-->

        
            
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
                        book Name :
                    </td>
                    <td>
                        <input type="text" placeholder="Book Name" name="b_name"> 
                    </td>
                </tr>


                <tr>
                    <td>
                        Edition:
                    </td>
                    <td>
                        <input type="text" placeholder="Edition" name="b_edition"> 
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
                    <td>
                        Issue Date:
                    </td>
                    <td>
                        <input type="text" placeholder="Issue Date" name="i_date"> 
                    </td>
                </tr>

                <tr>
                    <td>
                        Return Date:
                    </td>
                    <td>
                        <input type="text" placeholder="Return Date" name="r_date"> 
                    </td>
                </tr>

<!--                  <div class="buttonHolder">-->

<!--
                 <form action ="">-->
                <tr>
    
   
                <input value="Return"  type="submit" name="Returnbtn" required > 

<!--                </form>-->
                <!--                    <a href="/login">user</a>
                -->
                <a href="User Panel.jsp">
                <!--<input value="Back"  type="submit" name="Backbtn" required>-->
                Back
                </a>
            <!--</div>-->   
                    
                </tr>

            </table>

        
        
         </form>
        
    </body>
</html>