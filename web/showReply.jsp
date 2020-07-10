<%@ page import="java.util.List" %>
<%@ page import="com.po.Title" %><%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2020/4/13
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<base href="http://localhost:8080/luntan/">
<%@page isELIgnored="false" %>
<html>
<head>
    <title>显示贴子回复</title>
</head>
<body>

<table border="1" width="500">
    <tr><td colspan="2">贴子标题</td></tr>
    <c:forEach var="t" items="${title}">
    <tr><td colspan="2">${t.title}</td></tr>
    </c:forEach>
    <c:forEach var="c" items="${replyList}" varStatus="a">
        <tr>
            <td>回复时间:${c.time}</td>
            <td>${a.count}楼&nbsp;&nbsp;${c.account}&nbsp;&nbsp;回复:${c.msg}</td>
        </tr>
    </c:forEach>
</table>
<form method="post" action="control/addReply?id=${id}">
    请输入回帖内容:<textarea class="form-control o" rows="5" id="stmarker" name="msg"></textarea>
    <input type="submit">
</form>
</body>
</html>
