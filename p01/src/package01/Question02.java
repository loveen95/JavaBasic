package package01;
import java.util.*;
public class Question02 {

	public static void main(String[] args) {
//		1)원하는 기호를 입력하세요 >>>
//		2)원하는 횟수를 입력하세요 >>>
//         1)증가 2)감소 3)종료 >>1
//                   카운트 : 1
//         1)증가 2)감소 3)종료 >>1
//                   카운트 : 2
//         1)증가 2)감소 3)종료 >>2
//                   카운트 : 1 
//         1)증가 2)감소 3)종료 >>1
//                   카운트 : 2                
//         1)증가 2)감소 3)종료 >>3
//                   프로그램 종료 최종 카운트 : 2        	  
         Scanner sc = new Scanner(System.in);
         
         int count = 0;
         count = sc.nextInt();
         char want = '0';
         want = sc.next().charAt(0);         
         while(count < 3) {
        	   System.out.println("1증가 2)감소 3)종료>>");
        	   int num = sc.nextInt();         }
         
		
	}

}
