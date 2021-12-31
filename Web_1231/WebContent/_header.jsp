<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Bootstrap core CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<nav class="navbar navbar-expand-sm navbar-dark bg-dark"
	aria-label="Third navbar example">
	<div class="container-fluid">
		<a class="navbar-brand" href="/">마이메모</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarsExample03" aria-controls="navbarsExample03"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarsExample03">
			<ul class="navbar-nav me-auto mb-2 mb-sm-0">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="dropdown03"
					data-bs-toggle="dropdown" aria-expanded="false">메모</a>
					<ul class="dropdown-menu" aria-labelledby="dropdown03">
						<li><a class="dropdown-item" href="#">메모보기</a></li>
						<li><a class="dropdown-item" href="#">메모작성</a></li>
					</ul></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="dropdown03"
					data-bs-toggle="dropdown" aria-expanded="false">내정보</a>
					<ul class="dropdown-menu" aria-labelledby="dropdown03">
						<li><a class="dropdown-item" href="/member/join.jsp">회원가입</a></li>
						<li><a class="dropdown-item" href="/member/withdraw.jsp">회원탈퇴</a></li>
						<li><a class="dropdown-item" href="/member/login.jsp">로그인</a></li>
						<li><a class="dropdown-item" href="/member/logout.jsp">로그아웃</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</nav>