this is include page<br/>
/*
<jsp:include page="date_display.jsp">
    <jsp:param name="test" value="Test"/>
    <jsp:param name="fname" value="HARSH"/>
    <jsp:param name="lname" value="JOLAPARA"/>
</jsp:include>
*/
<jsp:forward page="date_display.jsp">
    <jsp:param name="test" value="Test"/>
    <jsp:param name="fname" value="HARSH"/>
    <jsp:param name="lname" value="JOLAPARA"/>
</jsp:forward>
<br/>this is after include/forward action