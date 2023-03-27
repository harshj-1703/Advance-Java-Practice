<%@  page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<c:out value="HJ"/>
<c:set value="${10*2}" var="age" scope="session" />
<c:out value="${age}"/>

<c:catch var="myexception">
    <% int a = 10/0; %>
</c:catch>
<p>
<c:if test="${myexception!=null}">
    Exception ${myexception}
</c:if>
<p>
<c:forTokens items = "micheal,harsh,manan" delims="," var="name">
    <c:out value="${name}"/><br>
</c:forTokens>
<p>
<c:set var = "salary" scope = "session" value = "${2000*2}"/>
      <p>Your salary is : <c:out value = "${salary}"/></p>
      <c:choose>
         <c:when test = "${salary <= 0}">
            Salary is very low to survive.
         </c:when>
         <c:when test = "${salary > 1000}">
            Salary is very good.
         </c:when>
         <c:otherwise>
            No comment sir...
         </c:otherwise>
      </c:choose>
<p>
<c:url value="http://www.google.com" var="myURL">
    <c:param name="trackingId" value="1234" />
    <c:param name="reportType" value="summary" />
</c:url>
${myURL}
<p>
//<c:import url = "http://google.com" var="mysite"/>
//${mysite}

//function
<c:set var = "theString" value = "I am a test String"/>
      <c:if test = "${fn:containsIgnoreCase(theString, 'test')}">
         <p>Found test string<p>
      </c:if>

      <c:if test = "${fn:containsIgnoreCase(theString, 'TEST')}">
         <p>Found TEST string<p>
      </c:if>
