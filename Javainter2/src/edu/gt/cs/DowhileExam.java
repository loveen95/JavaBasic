package edu.gt.cs;
import java.util.*;
public class DowhileExam {

	public static void main(String[] args) {
		// do ~while은 whlie 변형으로 기본 구조는 같지만 
		//while은 경우에  단 한번도 실행 되니 않는 경우도 있지만 
		//do while 은 반드시 한번은 무조건 실행
        //1~100 사이의 난수를 하나 생성해서 
		// 1과 100 사이의 정수를 입력하세요>>
		//더 작은 값으로  다시 입력하세요.
		//1과 100 사이의 정수를 입력하세요 >>20
		//더 큰 값으로 다시 입력하세요.
		//정답입니다.
		
		//Scanner sc = new Scanner(System.in);
//		Random ran =  new Random();
//	    int num = ran.nextInt(99) + 1;
//		int count = 0;
//		int input = 0;
//		do {
//			
//			System.out.println("1과 100사이의 정수를 입력하세요>>>");
//			input = sc.nextInt();
//			 if(input > num) {
//				 System.out.println("더 작은 값으로 입력하세요.");
//			 }else if (input < num) {
//				 System.out.println("더 큰 값으로 입력하세요.");
//			 }	 
//			 count ++;
//			} while (num != input);{
//			
//					System.out.println("정답입니다." + "횟수는"+ count+ "입니다.");
//				}
		
		//369게임 
		//100 이하에서 3의 배수일때 "짝"
		//36 "짝짝" 99"짝짝" 
		
	
//		
//		for(int i = 0 ; i <=100 ; i++) {
//			
//		         System.out.println(i);
//			int tmp = i;
//		 do{
//			if (tmp%10% 3 == 0 && tmp%10 !=0) {
//				System.out.print("짝");
//			}
//				
//			}while((tmp/=10)!= 0);
//		 System.out.println();
//		
//			}
		
//		int sum = 0;
//		int i = 0;
//		
//		while(true) {
//			if(sum >100) {
//				break;
//			}
//			++i;
//			sum += i;
//			
//		}
//		System.out.println("i =" + i);
//		System.out.println("sum =" + sum);
		
		//3의 배수만 출력하시오 . for와 continue를 사용하시오.
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 3 != 0)
//				continue;
//				System.out.println(i);
//				
//			}
//			
		
		//이름 붙은 반복문
		
		//break문은 근접한 단 하나의 반복문만 벗어날수 있다.
		//여러개의 반복문이 중첩된 경우 break만으로는 완전히 벗어 날 수 없다.
//		loop: 
//		while() {
//			 while() {
//				 break loop;
//			 }
//		 }
		//d이름이 붙여진 break를 사용하면 완전히 빠져 나갈수 있다.
		
		loop: //이름 붙은 반복문
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j  == 5)
					break loop;
				System.out.println(i + "*" + j+"=" + i * j);
			}
			System.out.println();
		}
		
		
			}
			
	}



