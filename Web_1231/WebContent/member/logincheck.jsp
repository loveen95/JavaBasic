<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	request.setCharacterEncoding("utf-8");

String uid = request.getParameter("id");
String upw = request.getParameter("pw");

MemberDAO dao = new MemberDAO(); 

int code = dao.login(uid, upw);

if (code == 1) {							// 회원 아이디가 존재 X
	response.sendRedirect("join.jsp");
} else if (code == 2) {						// 아이디는 존재 but 비번 일치 X
	response.sendRedirect("login.jsp");
} else {									// 로그인 성공
	session.setAttribute("id", uid);
	response.sendRedirect("/main.jsp");
}
%>