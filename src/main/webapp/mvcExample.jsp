<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h1>${myd}</h1>

<c:out value="${param.foo}" default="brak parametru"/>


My book title = ${book.title}

<ul>
    <c:forEach var="book" items="${books}">
        <li><c:out value="${book.title}"/></li>
    </c:forEach>
</ul>

<form method="post">
    <input type="text" name="user"/>
    <input type="submit">
</form>


<a href='<c:url value="/get1" />'>Link</a>
<a href="/get1">Link</a>

</body>
</html>
