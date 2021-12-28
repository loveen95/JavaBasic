<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import ="java.util.Date" %>
  <body> 
  <%!//선언문 
  String res = "";%> 
  <%@ include file="_header.jsp" %>
  <!--include지시어를 사용할때 주의할 점을 두 파일간에 이름이 같은 변수가 있으면 안된다.
    일반 자바에서와 똑갘이 충돌이 일어나게 된다.   -->
  
    <%
     //스크립트릿
     //스크립트릿 내에 정의된 코드는 서블릿 변환시 그대로 삽입된다.
     //따라서 java코드 형태로 실행된다. 
     String uid = request.getParameter("id");
     String ups = request.getParameter("ps");
     String res = "<h3>User ID : " + uid + "</h3>";
     res += "<h4>User PS :" + ups + "</h4>"; 
    
     //System.out.println(res);
     out.print(res); //웹 상에서의 출력
     out.print("<br>");
     out.print((new Date()).toString());
    
     
   
    
    %>
    </body>
