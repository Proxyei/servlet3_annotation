<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	<h1>用户首页${pageContext.request.contextPath}</h1>

	<div>
		<form action="${pageContext.request.contextPath}/servlet/user" method="post">
			<div>
				username:<input type="text" name="username" />
			</div>
			<div>
				password:<input type="password" name="userPassword" />
			</div>
			<div>
				<input type="submit" value="submit">
			</div>

		</form>
	</div>
</body>
</html>