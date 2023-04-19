<%@page import="mytest.AuthUser"%>
<html>
<head>
<title></title>
</head>
<body>
    Error
    <%
        AuthUser user = (AuthUser)request.getAttribute("userdetails");
    %>
    <br>
    <%
        out.println("Wrong password for : "+user.getUsername());
    %>
</body>
</html>