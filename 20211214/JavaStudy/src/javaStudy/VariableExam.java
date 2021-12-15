package javaStudy;

public class VariableExam { 
	//globalVariable 
	//전역변수 - 변수 선언 위치가 클래스 블록 안 
	//         변수의 사용범위는 클래스 전체가 된다.
	 int globalScope = 10;
	 static int staticVal = 7; //static은 객체를 생성 안하고도 생성 가능하다 . 
	public void scopeTest(int value) {
		int localScope = 20;
	     //메인 메소드
			//지역변수- 메소드 안에서 선언 
			//        변수의 사용 범위는 그 메소드로 제한된다.
        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
	
	}

	public static void main(String[] args) {

            
             System.out.println(globalScope);
             System.out.println(localScope);
             System.out.println(value);
             //static 변수는 static 을 선언하지 않은 메서드 내에서는 사용을 해도 문제가 되지
             //않는다. 
             
             System.out.println(staticVal);//객체를 찍지 않고도 
            
	}

}
