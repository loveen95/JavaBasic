package pack03;
import java.util.Scanner;//Scanner를 불러온다.
public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Scanner로 부터 키보드를 입력받게끔 한다.
		int i = 0;//숫자형 i = 0
		System.out.println("1) 별을 10개 찍어보세요 >>>");//질문 출력문
		String star = sc.next();//입력문	
		System.out.print("2) 원하는 기호를 입력하세요 >>> ");//질문 출력문
 		String sign = sc.next();//입력문
 		System.out.print("3) 원하는 횟수를 입력하세요 >>> ");//질문 출력문
 		int loop = sc.nextInt();//입력문
 		
 		while (i < loop) {//while문을 써서 i가 loop보다 작을때 반복 실행한다.
 			System.out.printf("%s", sign);//문자형의 값을 불러온다
 			i++;//반복될때마다 1씩 증가한다.
 		}
 		System.out.println();
 		
 		int allCount = 0; //변수 초기화 
 		int inputValue = 1; //변수 초기화
 		while(inputValue != 3) { //반복문 시작 구문 변수가 3이 아닐때 반복한다.
 			
 			System.out.print("1)증가 2)감소 3)종료를 선택해주세요. >>> ");//질문 출력문
 			inputValue = sc.nextInt();//입력문
 			
 			if (inputValue == 1) {//반목문의 조건문 변수가 1과 같을때만 참이다.
 				System.out.printf("카운트 : %d\n", ++allCount);//카운트는 증가한다.
 			} else if (inputValue == 2) {
 				System.out.printf("카운트 : %d\n", --allCount);//그외에 변수가 2와 같을때 카운트는 감소한다.
 			}
 		}
 		System.out.printf("시스템을 종료합니다. 현재까지의 카운트는 %d", allCount);//종료문과 현재까지의 카운트 횟수 출력한다.
 	}

        
	

}

