<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2020/4/13
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<base href="http://localhost:8080/luntan/">
<html>
<head>
    <c:choose>
        <c:when test="${type==1}">
            <title>管理员发帖</title>
        </c:when>
        <c:otherwise>
            <title>查看所有帖子</title>
        </c:otherwise>
    </c:choose>
</head>
<body>
<c:choose>
    <c:when test="${type==1}">
        <h3>管理员[<c:out value="${account}"/>]欢迎你 </h3>
        <form action="control/sendTitle" method="post">
            <table>
                <tr>
                    <td>标题名：</td><%--发帖--%>
                    <td><input type="text" name="title"></td>
                    <td><input type="submit" value="发帖"></td>
                </tr>
                <tr>
                    <td><font color="red">${msg}</font> </td>
                </tr>
            </table>
        </form>
    </c:when>
    <c:otherwise>
        <a href="control/queryAllTiltes">点击查看所有帖子列表</a>
    </c:otherwise>
</c:choose>
</body>
</html>
