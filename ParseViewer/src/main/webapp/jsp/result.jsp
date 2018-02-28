<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%String message = (String) request.getAttribute("result");%>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <p>The text belongs2 to..test</p>
    <p style="background-color: yellow"><%=message%></p>
    <br/>
    <hr/>
    <a href="http://localhost:8080/parser/" style="background-color: yellowgreen">HOME page</a>

</body>
</html>
