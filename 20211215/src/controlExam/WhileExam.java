package controlExam;
import java.util.Scanner;
public class WhileExam {

	public static void main(String[] args) {
		/*while 반복문은 for에 비해서 구조가 간단하다. 
		 *저건식이 참일 동안 반복 수행한다. 
		 *조건식 생략 불가, 보통 조건식에 true를 넣어 무한 반복 수행
		 *for문(::) while(true) 
		 *무한 반복 설정시에는 반드시 종료 조건을 만들어야 한다.
		 *
		 *
		 *while(조건식) {
		 *} 
		 * 
		 * 
		 * 
		 * */
		  //for(초기화; 조건식 ;증감)
		  //for(int i=0; i<5; i++)
			  
		/*초기화int i = 0;
		while(조건식i < 5) {
			증감식i++ */
		
		//quiz 1.while문을 사용하여 카운트다운 시작 
		
//		int i = 10; 
//		System.out.println("카운트다운시작!!!");
//		while (i >= 1 ) {
//			System.out.println(i);
//			i--;
//			long j = 9_999_999_999L;
//			while (j >= 0 ) {
//				j--;
//				
//			}
//			
//		}  
//	
//		
//       System.out.println("awesome!!!");
		
		//숫자를 입력하면 그 각각의 숫자들의 합을 구하시오. 
		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요>>>");
//		int sum = 0;
//		int num = 321;
//		
//		num = scan.nextInt();		
//		
//		while (num != 0 ) {
//			sum += num % 10;
//			num /= 10;
//			
//		
//			
//			
//			
//		}
//		System.out.println(sum);
		System.out.println("숫자를 입력하세요.");
		int sum = 0;
		int num = 10;
		int start = 1;
		sum = scan.nextInt();
		
		
		while (start <=num) {
			sum += start;
			
			
			System.out.println(start+"-" + sum);
			
			++start;
		} 
		
		
	}

}
