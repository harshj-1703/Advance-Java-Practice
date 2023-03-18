this is test jsp
<%
    String pageName = config.getInitParameter("pageName");
    %><br><%
    out.print(pageName);
    String appName = application.getInitParameter("appName");
    %><br><%
    out.println(appName);
%>