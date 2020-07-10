<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2020/4/13
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<base href="http://localhost:8080/luntan/">
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="509" height="204" border="1px" align="center" cellspacing="0" cellpadding="0">
    <tr>
        <td colspan="3" align="center">
            <span>帖子列表</span>
        </td>
    </tr>
    <tr>
        <td width="40" align="center">
            <span>序号</span>
        </td>
        <td width="390" align="center">
            <span>帖子标题</span>
        </td>
        <td width="79" align="center">
            <span>操作</span>
        </td>
    </tr>
    <c:forEach var="title" items="${titleList}" varStatus="no">
        <tr>
            <td align="center">${no.count}</td>
            <td align="center">${title.title}</td>
            <td align="center"><a href="control/queryReply?id=${title.id}">查看</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
