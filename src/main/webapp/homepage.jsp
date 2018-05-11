<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 20.04.18
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Witaj na stronie</p>
<c:if test="${cookie.accept==null}">
Informujemy że strona konrzysta z ciasteczek
<a href="?accept=true">Akceptuj</a>
</c:if>
</body>
</html>
