<html>
<body>
<h1>JAY HIND</h1>
<%
    int a = 5;
    for(int i=1;i<11;i++)
    {
        //out.println(a+" * "+i+" = "+(a*i)+"<br>");
    //}
%>
<%=a%>*<%=i%>=<%=(a*i)%><br>
<%}%><br>
<%=(4+5/6*8)%><br><br>
<%= new java.util.Date() %><br><br>
<%! int a=10; %><br>
<form action="" method="GET" >
    <input type="text" name="firstNum" placeholder="Please Enter a Number" required/>
    <input type="text" name="secondNum" placeholder="Please Enter a Number" required/><br>
    <input type="submit" name="add" value="add"/><br>
    <input type="submit" name="sub" value="sub"/><br>
    <input type="submit" name="mul" value="mul"/><br>
    <input type="submit" name="div" value="div"/><br>
</form>
<%
    String btn = request.getParameter("add");
    if(btn!=null && btn.equals("add"))
    {
        //out.println("btn clicked");
        if((request.getParameter("firstNum")) != null || (request.getParameter("secondNum")) != null )
        {
            int c = Integer.parseInt(request.getParameter("firstNum"));
            int d = Integer.parseInt(request.getParameter("secondNum"));
            out.println("sum = "+(c+d));
        }
        else
        {
            out.println("Empty Value");
        }
    }

    String btn1 = request.getParameter("sub");
        if(btn1!=null && btn1.equals("sub"))
        {
            //out.println("btn clicked");
            if((request.getParameter("firstNum")) != null || (request.getParameter("secondNum")) != null )
            {
                int c = Integer.parseInt(request.getParameter("firstNum"));
                int d = Integer.parseInt(request.getParameter("secondNum"));
                out.println("sub = "+(c-d));
            }
            else
            {
                out.println("Empty Value");
            }
        }

    String btn2 = request.getParameter("mul");
        if(btn2!=null && btn2.equals("mul"))
        {
            //out.println("btn clicked");
            if((request.getParameter("firstNum")) != null || (request.getParameter("secondNum")) != null )
            {
                int c = Integer.parseInt(request.getParameter("firstNum"));
                int d = Integer.parseInt(request.getParameter("secondNum"));
                out.println("mul = "+(c*d));
            }
            else
            {
                out.println("Empty Value");
            }
        }

    String btn3 = request.getParameter("div");
        if(btn3!=null && btn3.equals("div"))
        {
            //out.println("btn clicked");
            if((request.getParameter("firstNum")) != null || (request.getParameter("secondNum")) != null )
            {
                int c = Integer.parseInt(request.getParameter("firstNum"));
                int d = Integer.parseInt(request.getParameter("secondNum"));
                out.println("div = "+(c/d));
            }
            else
            {
                out.println("Empty Value");
            }
        }
%>

</body>
</html>
