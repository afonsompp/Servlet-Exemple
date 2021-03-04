<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page
	import="java.util.List, br.com.zup.manager.servlet.Enterprise, java.util.Arrays"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<c:url value="/enterprise" var="enterprise" />
</head>
<body>

	<form action="${ enterprise }" method="post">
		<span>Nome da empresa: </span> <input type="text" name="name" /> <br>
		<br>
		<span>Data de fundação: </span> <input type="date" name=fundation />

		<br><br>
		<input type="submit" value="Cadastrar" />
	</form>
</body>
</html>