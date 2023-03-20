<%@page import="mytest.AuthUser"%>
<html>
<head>
<title></title>
</head>
<body>
    this is dashboard
    <%
        AuthUser user = (AuthUser)request.getAttribute("userdetails"); %><br><%
        out.println("Welcome "+user.getUsername());
    %>
</body>
</html>