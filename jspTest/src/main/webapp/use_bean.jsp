<jsp:useBean id="userObj" scope="page" class="mytest.User"/>
<jsp:useBean id="mathFun" scope="page" class="mytest.MathFun"/>

<%
    userObj.setName("Harsh");
    userObj.setAge(19);
    out.println(userObj.displayDetails());
%><br/>
<%=mathFun.cube(5)%><br>
<% int plain = 5;
   int encoded = mathFun.encode(plain);
   out.println(encoded);
   int decoded = mathFun.decode(encoded);
   out.println(decoded);
   %>
<!--
<jsp:setProperty name="userObj" property="name" value="Harsh"/>
<jsp:setProperty name="userObj" property="age" value="18"/>
<jsp:getProperty name="userObj" property="name"/>
-->
<hr>
<jsp:setProperty name="userObj" property="*"/>
<jsp:getProperty name="userObj" property="name"/>
<jsp:getProperty name="userObj" property="age"/>