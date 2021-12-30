<%--지시어 directive 
 페이지 처리를 위해 부가적인 정보를 정의하는데 이용
 @annotation 

 page - JSP처리 방법을 정의 import 한글 설정 
 include - 다른 문서를 포함 header footer 
 taglib - 태그 라이브러리 설정 JSTL - JSP Standard Tag Library 
--%>
<%@page import="dao.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--charset=UTF-8" pageEncoding="UTF-8" GET 방식에서의 한글처리--%>
    <%@ page import ="java.util.Date" %>
  <%   request.setCharacterEncoding("utf-8");
     //포스트 방식에서의 한글 처리
     %> 
    
  <%--   JSP의 스크립팅 요소 5가지 
    <%.........%>스크립틀릿 scriptlet 일반 자바 코드 삽입
    <%@..... %> 지시어 directive
    <%=...... %> 표현식 expression
    <%!...... %> 선언문 declaration
           주석 comment  --%> 
           
    <!-- html 주석 -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%  String uid = request.getParameter("id");
     String ups = request.getParameter("ps");
     
     UserDAO dao = new UserDAO();
   
     int result = dao.login(uid,ups);
     
     if(result==1)
    	 out.print("아이디가 존재하지않습니다.");
     else if (result ==2)
    	 out.print("비밀번호가 일치하지 않습니다.");
     else 
    	 session.setAttribute("id", "uid"); 
     
          response.sendRedirect("main.jsp");
 
 %> <!--  -->



</body>
</html>