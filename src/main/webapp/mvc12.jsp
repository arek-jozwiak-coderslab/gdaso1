<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 10.05.18
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="o" begin="${start}" end="${end}">
    <c:out value="${o}"/>
</c:forEach>
</body>
</html>
