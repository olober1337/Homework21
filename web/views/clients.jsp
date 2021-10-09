<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Clients</title>
</head>
<body>
<table
        border="1"
        align="center"
        rules="rows"
        style="width:60%;">
    <caption>Clients</caption>
    <c:forEach items="${clients}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.email}</td>
            <td>${item.phone}</td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}">go to main page</a> <br>
</body>
</html>