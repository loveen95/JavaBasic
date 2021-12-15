package variableExam;

public class VariableExam {

	public static void main(String[] args) {
		
	/*변수 Variable -  "단 하나의값을 저장할수 있는 메모리 공간"
	 
	  변수를 사용하기 위해서는 멎저 초기화 해야한다.
          변수이름 : 메모리 공간에 이름을 붙인다. 같은 이름이 여러개 존재할 수 없다.
     int = age; //age라는 이름의 변수를 선언
	  변수 타입 : 변수에 저장될 값의 종류를 지정하는 것. 숫자 정수int 실수double 문자String
	 
	 int age = 25; //변수 age를 선언하고 25로 초기화 한다.
	 
	 int a; 
	 int b;  -> int a, b;
	  
	 int x= 0;
	 int y= 0; -> int x = 0, y = 0;
	  변수를 사용하기 전에 적절한 값으로 초기화   
     "변수의 초기화란?"-변수를 사용하기 전에 처름으로 값을 저장하는 것
		  */ 
		
		
	  //두 변수의 값 교환
//		
//		int x = 10;
//		int y = 20;
//		
//		System.out.println("x =" + x);
//		System.out.println("y =" + y);
//		
//		x = y; // x 20 y 20
//		y = x; // x 20 y 20
//		
//		System.out.println("x =" + x);
//		System.out.println("y =" + y);
		
		int x = 10;
		int y = 20;
		
		int temp;
		temp = x; //temp 10 x 10y 20
		x = y;    //temp 10 x 20y 20
		y = temp; //temp 10 x 20y 10
		
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		
		// x, y = y, x (파이썬에선 이렇게 함)
		
		
		
		
		
//		
//		int year = 0;
//		int age = 15;
//		
//		System.out.println(year);
//		System.out.println(age);
//		
//		year = age + 2000; //15 + 2000 = 2015 year
//		age = age +1;    //15 + 1 = 16 age
//		
//		System.out.println(year);
//		System.out.println(age);
//		
		
		
		
		
		
		
		
		}
	

}
