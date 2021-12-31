<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

String uid = request.getParameter("id");
String upw = request.getParameter("pw");
String una = request.getParameter("name");
String uem = request.getParameter("email");
String uge = request.getParameter("gender");

MemberDAO dao = new MemberDAO();

if (dao.exist(uid)) {
	response.sendRedirect("/member/join.jsp");
}
else {
	if (dao.insert(uid, upw, una, uem, uge)) {
		session.setAttribute("id", uid);
		response.sendRedirect("/main.jsp");
	}
}
%>