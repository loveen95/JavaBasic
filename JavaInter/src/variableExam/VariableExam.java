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
		
/*변수 선언 규칙
1. 대소 문자를 구분하며 길이에는 제한이 없다.
2. 예약어를 사용할수 없다.
3. 숫자로 시작 할 수없다.
4. 특수문자 _ $ 만 허용한다. 
 권장사항 -클래스명의 첫글자는 항상 대문자로 시작을 권장  
      -변수명과 메서드명의 첫글자는 항상 소문자로 시작을 권장    
      -여러 단어의 사용할때는 단어의 첫글자는 대문자 사용 권장
      -상수 이름은 전부 대문자 사용을 권장 
      
      
      
      
 #변수 타입 
 주로 사용하는 값은 크게 문자와 숫자, 숫자는 다시 정수 실수...
 값(data)의 종류 (type)에 따라 저장될 공간의 크기와 형식을 정하는 것이 자료형  
    
 기본형(primitive type) - 실제 값이 저장, 총 8개 
  -논리 boolean 문자 char 정수 int long (byte, short)실수 double float 등등  
 참조형(reference type) - 실제 값이 저장되어 있는 주소 값을 갖는다.  
  -기본형을 제외한 모든 나머지 
  
 기본형(primitive type)
 -논리형 boolean : true or false, 조건식, 논리 계산...에 사용 
 -문자 char : 변수 하나에 한글자만 저장 
 -정수형 int long byte short 정수, 주로 int 가 사용된다. 
 -실수형 double float 실수를 저장한다. 주로 double 이 사용된다.
 
 int - 2,147.483,678 ~ 2,147,483,647 이 크기만 담을수 있다.
 long - 9,223,372,036,845,775,808
 
 #상수 constant  
 변수와 마찬가지로 값을 저장 할수 있는 공간 변수와는 달리 한버 값을 저장하면 변경하지 않고 사용한다.
 선언하는 방법도 변수와 동일하지만 final을 붙여서 상수를 나타낸다. 
 대문자로 상수명 표기한다. 
 
 final int MAX_SPEED = 100;// 상수를 final로 선언하면 변경 불가능.
 
  상수선언은 반드시 선언과 동시에 초기화 해야만 한다! 
  final int MIN_SPEED; (X)
  MIN_SPEED = 30; (X) 변경 할수 없다 .
   상수의 이름 모두 대문자로 하는 것이 암묵적인 관례이다 .
    
  int i = 'A'; //'문자'a의 코드값이 저장된다.
  long l = 123; //int 크기보다 long의 크기가 더 크다. 
  double d = 3.14f; //더블이 플롯보다 더 크다.
  float f = 3.14; //더블을 플롯에 넣을수 없다. 크기와 상관없이
                                        무조건 double은 float에 넣을수 없다.  
                                        
  변수와 함께 많이 사용되는 printf()
  
  println()만 사용했지만 println()은 변수값을 그대로 출력하므로 다른 형태로는 출력하기가 힘들다.
       예를 들면 소수 2자리 까지만 출력...   
    print() 는 println()과 달리 줄 바꿈을 하지 않는다. 
    줄 바꿈을 할때에는 %n을 넣는다.   
    %5 declmal 10진수 즉 숫자 출력
    %s String 문자열 출력 
    %f 실수 출력
    %c 문자 출력
       
       int age = 14;
       int year = 2021;
  System.out.printf("age:%d" , age);
  System.out.printf("age:%d" , age);
  System.out.printf("age:%d" year:%d" , age, year);
  System.out.printf("age:%d%n year:%d" , age, year);
    
   
   
   
   
 참조형(reference type)
  -
 
 
 */
	
		
//	String url = "www.naver.com";
//	float f1 = .10f;
//	float f2 = 3.14e3f;
//	double d = 1.23545678;
	
//		System.out.printf("f1 : %f,", f1);
//		System.out.printf("f2 : %f,", f2);
//		
//		System.out.printf("d : %10.2f%n,", d);
//		
//		System.out.printf("Address : %s%n,", url);
//		System.out.printf("%10.8s%n,", url);//총 10칸을 만들어 놓고 .뒤에8글자만 출력
//		System.out.printf("%-10.8s%n,", url);//-는 왼쪽 정렬
//		
		
		
		
		
//		int curPos = 0;//현재 위치 current position
//		int lastPos = 1; //마지막 위치 last 
		
		
		
		
		
		
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
		
//		int x = 10;
//		int y = 20;
//		
//		int temp;
//		temp = x; //temp 10 x 10y 20
//		x = y;    //temp 10 x 20y 20
//		y = temp; //temp 10 x 20y 10
//		
//		System.out.println("x =" + x);
//		System.out.println("y =" + y);
		
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
