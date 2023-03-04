<html>
<body>
    <form action="" method="post">
        <input type="text" name="username" placeholder="Please Enter a Username" required/>
        <input type="text" name="password" placeholder="Please Enter a Password" required/><br>
        <input type="submit" name="login" value="login"/><br>
    </form>

    <%
        String loginButton = request.getParameter("login");
        if(loginButton != null && loginButton.equals("login"))
        {
            String usr = request.getParameter("username");
            String pwd = request.getParameter("password");
            if(usr.equals(pwd))
            {
                out.println("Login Successful");
            }
            else
            {
                out.println("Wrong Credentials");
            }
        }
    %>
</body>
</html>