<%@ page import="java.util.Date"
contentType="text/json"
language="java"
isThreadSafe="true"
%>

<%@page session="false" pageEncoding="UTF-8"%>
{Date and time : <%= new Date()%>}


<%
    //session.setAttribute("uname","My name");
    //response.setIntHeader("Refresh",5);
    //String uname = request.getParameter("uname");
    /*if(uname!=null)
    {
        out.print(uname.toUpperCase());
    }*/
    String a = request.getParameter("num1");
    String b = request.getParameter("num2");
    if(a!=null && b!=null)
    {
        out.print("a+b : "+(Integer.parseInt(a)+Integer.parseInt(b)));
    }
%>