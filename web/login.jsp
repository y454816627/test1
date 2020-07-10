
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<base href="http://localhost:8080/luntan/">
<body>
<form action="control/login" method="post">
    <table>
        <tr><td>用户名：</td>
            <td><input type="text" name="account"></td>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
            <td><input type="submit" value="登录"></td>
        </tr>
        <tr><td><font color="red">${msg}</font> </td></tr>
    </table>
</form>
</body>
</html>
