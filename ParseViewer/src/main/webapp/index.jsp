<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Verify string</title>
</head>
<body>
    <h2>Parser</h2>
    <p>Enter some text: phone or email or name or Social Security Number:</p>
    <p>Examples</p>
    <p>xxxxxxxx or +375xxxxxxxxxx (Digits)</p>
    <p>xxxxxxx@xxxx.xxx</p>
    <p>xxxxxxxxx (Letters)</p>
    <p>xxx-xx-xxxx (Digits)</p><br/>
    <form action="FrontController" method="post">
        <input type="text" name="verifyString" value="" title=""/><br/>
        <input type="submit" name="check" value="Check"/><br/>
    </form>
</body>
</html>
