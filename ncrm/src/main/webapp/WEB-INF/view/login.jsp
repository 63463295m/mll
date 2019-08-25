<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/init/init.jsp" %>

<html>
<body>
<h2>Hello World!</h2>
<h2>${login.account}</h2> <br>
注册时间: ${login.registrationDate} <br>

<a href="/loginController/allLogin" >get所有用户</a>


</body>
</html>
