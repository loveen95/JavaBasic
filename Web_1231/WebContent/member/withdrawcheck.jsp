<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MemberDAO dao = new MemberDAO();

String uid = request.getParameter("id");
String upw = request.getParameter("pw");
String sid = (String) session.getAttribute("id");

if(dao.exist(uid) == false) {
	response.sendRedirect("withdraw.jsp");
}

if(uid.equals(sid)) {
	if(dao.delete(sid)) {
		response.sendRedirect("join.jsp");
	} else {
		response.sendRedirect("withdraw.jsp");
	}
} else {
	response.sendRedirect("withdraw.jsp");
}
%>