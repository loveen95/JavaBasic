<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
</head>
<body>
	<%@ include file="/_header.jsp"%>
	<%@ include file="/_footer.jsp"%>
	<div class="alert alert-dark" role="alert">회원탈퇴 - 로그인 후 이용하세요</div>
	<div class="container">
		<form action="withdrawcheck.jsp" method="post">
			<div class="row mb-3">
				<label for="inputEmail3" class="col-sm-2 col-form-label">아이디</label>
				<div class="col-sm-10">
					<input type="text" name="id" class="form-control" id="inputEmail3">
				</div>
			</div>
			<div class="row mb-3">
				<label for="inputEmail3" class="col-sm-2 col-form-label">비밀번호</label>
				<div class="col-sm-10">
					<input type="password" name="pw" class="form-control" id="inputEmail3">
				</div>
			</div>
			<button type="submit" class="btn btn-primary">탈퇴</button>
		</form>
	</div>
</body>
</html>