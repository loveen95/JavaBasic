<%@page import="dao.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
MemoDAO dao = new MemoDAO();

String ume = request.getParameter("memo");
String sid = (String) session.getAttribute("id");

if (dao.insert(sid, ume)) {
	response.sendRedirect("/main.jsp");
}
%>