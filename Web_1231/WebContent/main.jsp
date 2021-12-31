
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="util.ConnectionPool"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.84.0">
<title>ToDo</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/album/">

<!-- Favicons -->
<link rel="apple-touch-icon"
	href="/docs/5.0/assets/img/favicons/apple-touch-icon.png"
	sizes="180x180">
<link rel="icon" href="/docs/5.0/assets/img/favicons/favicon-32x32.png"
	sizes="32x32" type="image/png">
<link rel="icon" href="/docs/5.0/assets/img/favicons/favicon-16x16.png"
	sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/5.0/assets/img/favicons/manifest.json">
<link rel="mask-icon"
	href="/docs/5.0/assets/img/favicons/safari-pinned-tab.svg"
	color="#7952b3">
<link rel="icon" href="/docs/5.0/assets/img/favicons/favicon.ico">
<meta name="theme-color" content="#7952b3">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>


</head>
<body>
	<%@ include file="_header.jsp"%>
	<div class="alert alert-dark" role="alert">메인</div>
	<%
		String uid = (String) session.getAttribute("id");

	if (uid == null) {
		response.sendRedirect("/member/login.jsp");
	}

	session.setAttribute("id", uid);
	%>
	<div class="container">
		<form action="/memo/memocheck.jsp">
			<div class="form-floating">
				<textarea name="memo" class="form-control"
					placeholder="Leave a comment here" id="floatingTextarea2"
					style="height: 100px"></textarea>
				<label for="floatingTextarea2">메모</label>
			</div>
			<button class="w-100 btn btn-lg btn-primary" type="submit">완료</button>
		</form>
	</div>
	<table align="center">
		<%
			Connection conn = ConnectionPool.get();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM memo");

		while (rs.next()) {
		%>
		<tr>
			<td colspan=2><hr></td>
		</tr>
		<tr>
			<td><%=rs.getString("no")%></td>
			<td><small><%=rs.getString("ts")%></small></td>
		</tr>
		<tr>
			<td colspan=2><%=rs.getString("memo")%></td>
		</tr>

		<%
			}
		%>
	</table>
	<%@ include file="_footer.jsp"%>
</body>
</html>