package pack02;
import java.util.Scanner;
public class Tese02 {

	public static void main(String[] args) {
		System.out.println("숫자 크기 판별");
		 
		
		 int fno = 0; // 뒷 숫자 큰 경우 변수
	      int lno = 0; // 앞숫자 큰경우 변수
	      int count = 0; //전체 시도 횟수 변수
	     char ox = 'o'; // 계속 진행 여부 변수
	      Scanner sc = new Scanner(System.in); //입력 객체 생성
	      
	     
	     while(ox != 'x') { // 반복 구문 시작
	    	 System.out.print("숫자를 입력>>>"); //입력 구문
	    	 int a =sc.nextInt();//숫자 키보드로 입력
	    	 System.out.print("숫자를 입력>>>");//입력 구문
	    	 int b =sc.nextInt();//숫자 키보드로 입력
	    	 if(a > b) {//if문을 써서 조건문 시작 a가 b보다 크다고 가정
	    		 System.out.println("판결은 앞숫자가 큽니다.");//츨력구문
	    		 
	    		 fno++;//앞 숫자가 큰 경우 변수 증가
	    		 count ++;//시도 횟수 변수 증가
	    		  
	    	 }else{//if의 조건이 아닐경우
	         System.out.println("뒷 숫자가 큽니다");//b가 a보다 큽니다.	 
	    		 lno++; //뒷숫자 큰경우 변수 증가
	    		 count ++; //시도 횟수 변수 증가
	    	 }
	    	 System.out.print("계속 하시겠습니까(계속 : o, 중단 : x)");//반복 여부 입력구문
	         ox = sc.next().charAt(0);
	     } 
	      
	     System.out.println("프로그램을 종료합니다.");//종료 출력
	     System.out.printf("시도횟수:" + count);//총 시도 횟수
	     System.out.printf("앞 숫자가 큰횟수:" + fno);//앞 숫자가 큰 경우 횟수
	     System.out.printf("뒷숫자가 큰횟수:" + lno);//뒷 숫자가 큰 경우 횟수 

	}

}
