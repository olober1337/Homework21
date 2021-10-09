<%--
  Created by IntelliJ IDEA.
  User: mcram
  Date: 12.08.2021
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>App</title>
</head>
<body>
<table
        border="1"
        bgcolor="#e6e6fa"
        cellpadding="10"
        style="width:100%;
        border-radius:5px;">
    Welcome <br>
    <a href="${pageContext.request.contextPath}/clients">Clients</a> <br>
    <a href="${pageContext.request.contextPath}/accounts">Accounts</a> <br>
    <a href="${pageContext.request.contextPath}/statuses">Statuses</a> <br>
    <a href="${pageContext.request.contextPath}/client_status">Clients with Statuses</a> <br>
</table>
</body>
</html>
