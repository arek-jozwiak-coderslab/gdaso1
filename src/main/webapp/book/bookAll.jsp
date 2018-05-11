<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 11.05.18
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
<c:forEach var="book" items="${books}">
    <li>${book.title} - ${book.author}
        <a href="/bookDelete?id=${book.id}">Usuń</a>
        <a href="/bookEdit?id=${book.id}">Edytuj</a>
    </li>
</c:forEach>
</ul>
</body>
</html>
