<%
//create simple api which accept firstname,lastname,dob and it will print full name,age in years
%>
<html>
<head>
<title>HW of 13</title>
</head>
<body>
    <form action="" method="GET">
        <input type="text" name="firstname" placeholder="Please Enter a Firstname" required/>
        <input type="text" name="lastname" placeholder="Please Enter a Lastname" required/><br>
        <input type="date" name="dob" required/><br>
        <input type="submit" name="submit" value="submit"/><br>
    </form>
</body>
</html>

<%
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String dob = request.getParameter("dob");
    if(firstname!=null && lastname!=null && dob!=null)
    {
       out.print(firstname.toUpperCase()+lastname.toUpperCase());

    }
%>