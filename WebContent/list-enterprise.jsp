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
<c:url value="/NewEnterprise.jsp" var="linkNewEn" />
<c:url value="/RemoveEnterprise" var="delete" />
<c:url value="/UpdateEnterprise.jsp" var="update" />

</head>
<body>
	<c:if test="${ not empty enterprise }">
		Empresa ${ enterprise } cadastrada com sucesso!
		<hr />
	</c:if>

	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Fundação</th>
				<th>Ações</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${ enterprises }" var="e">
				<tr>
					<fmt:parseDate value="${e.fundation }" type="date" var="date"
						pattern="yyyy-MM-dd" />
					<fmt:formatDate value="${ date }" type="date" var="fundation"
						pattern="dd/MM/yyyy" />
					<td>${ e.id }</td>
					<td>${ e.name }</td>
					<td>${ fundation }</td>
					<td>
						<a href="${ delete }?id=${e.id}">Excluir </a> | 
						<a href="${ update }?id=${e.id}&name=${e.name}&fundation=${e.fundation}">Atualizar</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<a href="${ linkNewEn }">Cadastrar nova empresa</a>
</body>
</html>