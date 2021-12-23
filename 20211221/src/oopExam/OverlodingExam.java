package oopExam;

public class OverlodingExam {

	public static void main(String[] args) {
		/*            !!!!!!많이 씀!!!!! 
		 * 
		 * <Overloding>
		 * -자바에서는 한 class내의 이미 사용중인 이름과 동일한 이름의 메서드가 있더라도 매개변수의 갯수가 타입이 다르면 같은 이름을 사용하여
		 *  매서드를 정의할 수 있다.
		 * -오버로딩의 사전적 의미는 '과적하다' 즉 많이 싣는 것을 말한다. 보통 하나의 매서드 이름에 
		 *  하나만의 기능만을 구현하는데 하나의 이름으로 여러 기능을 구현하고자 할때 사용된다. 
		 * 
		 * 1. 매서드명이 동일해야 한다.
		 * 2. 매개변수의 개수 또는 타입이 달라야한다.
		 * 3. 오버로딩에서 반환타입은 오버로딩 구현에 있어서 아무런 영향을 주지 못한다. 
		 * 
		 * 예)println()
		 *   println(int x)
		 *   println(String a, String b) 등등.... 같은 이름으로 오버로딩을 구현하기 때문에 
		 * 
		 * 메서드 오버로딩을 사용하면 사용자가 단 하나의 메서드 명으로 다양한 처리 결과를 얻을수 있도록 구성 할 수 있다. 
		 * (매번 다른 이름의 매서드를 생성할 필요가 없다.)
		 * 
		 * variable arguments 가변인자
		 * 가변인자 오버로딩(일일이 갯수를 지정해주기 어렵기 때문에 알아서 처리해주는 기능)
		 * - JDK 1.5 부터 매개변수의 갯수를 동적으롤 지정 할  수 있다.
		 * 
		 * 
		 * */
String[] strArr = {"10","20","30"};		
String[] strArr2 = {"10","20","30","40","50"};
int[] intArr1 = {1,2,3};
int[] intArr2 = {1,2,3,4,5};

//102030, 10 20 30, 10-20-30, 10 20 30 40 50  
System.out.println(arrCal("+",intArr1));
System.out.println(arrCal("*",intArr2));
System.out.println(concat("",strArr));
System.out.println(concat("",strArr2));
		
System.out.println(concat("-",strArr));
System.out.println(concat("/",strArr2));
	}
	
	static String concat(String a, String...args) {
		              //문자로 하나 받고       //...갯수 상관없이 다 불러 올때 사용
		String result = "";
		
		for(String str :args) {
			result += str + a; 
		}
		
		return result;
	}
static int arrCal(String a, int...args) {
     int result = a.equals("+") ? 0 : 1; 
	for(int arg : args) {
		
	if(a.equals("+")){
	        // ==는 숫자비교 .equals는 문자 비교!!!!! 꼭 기억	
		result += arg;
		 
	}else if(a.equals("*")) {
		
		result *= arg;
		
	}
}	
 return result;
//		System.out.println(add(2,3));
//		System.out.println(add(2,3,4));
//		add("홍길동",990);
//          
//	}
//	

//         static int add(int a ,int b) {
//              int result = a + b;       
//        	 return result; 	 
// }
//         static int add(int a ,int b, int c) {
//             int result = a + b + c;       
//       	     return result; 	
//  }
//         static void add(String a ,int b) {
//                    System.out.println(a  + "님의 토익 점수는" + b);
       	      	
  }
}