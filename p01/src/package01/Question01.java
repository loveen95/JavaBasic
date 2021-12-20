package package01;
import java.util.Scanner;
public class Question01 {

	public static void main(String[] args) {
		// do while 이 더 적합하지만 while로 풀이하세요. 
		   System.out.println("숫자를 입력하세요.");
		
	  
      int fno = 0; // 뒷 숫자 큰 경우 변수
      int lno = 0; // 앞숫자 큰경우 변수
      int count = 0; //전체 질문 횟수 변수
     char ox = 'o'; // 계속 진행 여부 변수
      Scanner sc = new Scanner(System.in); //입력 객체 생성
      
     
     while(ox != 'x') { // 반복 구문 시작
    	 System.out.print("숫자를 입력하세요>>>"); //입력 구문
    	 int a =sc.nextInt();
    	 System.out.print("숫자를 입력하세요>>>");
    	 int b =sc.nextInt();
    	 if(a > b) {
    		 System.out.println("앞 숫자가 큽니다");
    		 
    		 fno++; 
    		 count ++;
    		  
    	 }else{
         System.out.println("뒷 숫자가 큽니다");	 
    		 lno++; 
    		 count ++;
    	 }
    	 System.out.print("계속 할까요?(계속 : o, 중단 : x)");
         ox = sc.next().charAt(0);
     } 
      
     System.out.println("프로그램을 종료합니다.");
     System.out.printf("시도횟수:" + count);
     System.out.printf("앞 숫자가 큰경우:" + fno);
     System.out.printf("뒷숫자가 큰경우:" + lno);
     
     
     
	}

}
