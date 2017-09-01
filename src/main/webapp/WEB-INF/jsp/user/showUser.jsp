<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<%@include file="../common/taglib.jsp" %>
<head>
    <title>测试</title>
</head>

<body>
<c:if test="${sessionScope.user.userName==null}">
    请登录!!!
</c:if>
<c:if test="${sessionScope.user.userName!=null}">
    ${sessionScope.user.userName}!欢迎你!!!
</c:if>

</body>
</html>  