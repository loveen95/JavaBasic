package com.test; //패키지 선언

import java.io.IOException; //필요한 클래스들으 자동으로 import
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogicServlet
 */
@WebServlet("/loginServlet") //호출되는 이름 
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super(); //생성자 부모 클래스의 생성자를 호출해서 초기화
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //get 방식(주소와 함께 넘겨 받는 데이터)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	
	String res = "<html><h3>user ID : " + uid + "</h3>";
	res += "<h3>user Password : "+ups + "</h3>";
	res += "</html>";
	
	response.getWriter().print(res);
	
	}
	

	

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//post(body에 포함하여 넘겨 받는 데이터)
	//post방식으로 넘겨받은 데이터도 결국 내부적으로 doGet()함수를 다시 호출하여 처리한다. 
	//따라서 doGet()메소드만 구현하면 함께 처리할수 있다. 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response); 
	}

}
