<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 11.05.18
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edytuj książkę</h1>
<form method="post">
    <p>Podaj Tytuł</p><br/>
    <input type="hidden" name="id" value="${book.id}"/>
    <input type="text" name="title" value="${book.title}"/>
    <p>Podaj author</p><br/>
    <input type="text" name="author" value="${book.author}" />
    <p>Podaj isbn</p><br/>
    <input type="text" name="isbn" value="${book.isbn}"/>
    <input type="submit"/>
</form>
</body>
</html>
