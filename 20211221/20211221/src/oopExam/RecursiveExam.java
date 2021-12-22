package oopExam;

public class RecursiveExam {

	public static void main(String[] args) {
	                //웹 개발에 직접적인 도움은 안주지만 그래도 알아놓으면 좋음
/* -재귀호출- recursive (자원소모가 심해서 많이 쓰이진 않음) 
 * 매서드 내부에서 자기 자신 매서드를 다시 호출 
 * 무한적으로 자기 자신 호출이 가능하기 때문에 무한 반복에 빠지게 된다. 따라서 조건문을 통한 탈출이 필수적으로 따라다닌다. 
 * 
 * void method(int n){
 *   if(n==0){
 *     return;
 *   }
 *    System.out.println(n);
 *    method(--n); //자기 자신에서 하나를 빼서 들어간다.
 * 
 * 반복문은 같은 문장을 반복해서 수헹하지만 재귀호출은 반복문 보다 몇가지 과정
 *  예) 매개변수 복사 종료 후 복귀 할 주소 저장 등등 내부적으로 추가로 필요한 것들이 많아서 
 *     일반적으로 반복문보다 재귀 호출이 수행시간이 더 오래걸린다.
 *     
 *   왜 굳이 반복문 대신 재귀문을 사용할까 ? 큰 이유는 재귀의 논리적 간결함이다.
 *   
 *   재귀호출은 비 효율적이므로 재귀 사용에 드는 비용보다 간결함이 주는 이득이 월등히 충분히 큰 경우에만 사용할 것을 권장한다.
 *   
 *    5! = 5*4*3*2*1 //
 *    3! = 3*2*1
 *    
 * */		
//		System.out.println(recursiveExam.factor(5));  
//		System.out.println(recursiveExam.facrecur(5)); 
		
		//x^1 부터 x^n 의 합을 구하는 재귀 메사드
//		System.out.println(recursiveExam.powRecur(2,5)); 
	
		int x = 2;
		int n = 5;
		int result = 0; 
		
		for(int i = 1 ; i < n ; i++) {
			result = result + power(x, i);
		}
		System.out.println(result);
	}
	
	static int power(int x , int i) {
		if (i == 1) return x;
		return x * power(x, i-1);
	}
	
//	static int factor(int n) {
//		int facto = 1; //곱셈은 1로 초기화를 한다.
//		for (int i = 1; i <= n; i++) {
//			facto *= i; //factor = facto * i 
//			System.out.println("i = " + i + "facto = " +  facto); //중간과정
//	
//	  }
//		return facto;
//		
//	}
//	
//	static int facrecur(int n) {
//			 
//	 int result = 0;
//	 
//	 if(n == 1) result = 1;  
//	 else result = n * facrecur(n-1); //핵심
//	 //n = 5 라면  5 * 4 * 3 * 2 * 1  
//	 return result;
//	  }
//	
//	static int powRecur(int n) {
//		int a = 2;
//		
//		if(n == 3) a = 3;
//		else a = n^2 * powRecur
//		
		
		
		
	}
		
	


