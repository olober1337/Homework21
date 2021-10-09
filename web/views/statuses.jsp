<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statuses</title>
</head>
<body>
<table
        border="1"
        align="center"
        rules="rows"
        style="width:60%;">
    <caption>Statuses</caption>
    <c:forEach items="${statuses}" var="item">
        <tr>
            <td>${item.alias}</td>
            <td>${item.description}</td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}">go to main page</a> <br>
</body>
</html>
