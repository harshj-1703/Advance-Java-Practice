<%@  page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:out value="HJ"/>
<c:set value="${10*2}" var="age" scope="session" />
<c:out value="${age}"/>

