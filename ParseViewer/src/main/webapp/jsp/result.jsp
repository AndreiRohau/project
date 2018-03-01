<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%String message = (String) request.getAttribute("result");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Verification result</title>
</head>
<body>
    <p>The text belongs to..</p>
    <p style="background-color: yellow"><%=message%></p>
    <br/>
    <hr/>
    <a href="http://localhost:8080/parser/" style="background-color: yellowgreen">HOME page</a>

</body>
</html>
