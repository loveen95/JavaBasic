<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
 Enumeration<String> en = request.getHeaderNames();
 while (en.hasMoreElements()) {
	 String name = (String)en.nextElement();
	 String value = request.getHeader(name);
	 out.print(name + ":" + value + "<br>");
	 //Enumeration 순서가 없는 키값 벨류 값 형태를 순서가 있는 형태로 만들어준다.
 }

%>

</body>
</html>