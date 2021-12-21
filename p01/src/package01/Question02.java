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
         want = sc.next().charAt(0); //String타입을 char타입으로 변환할 때        
         while(count < 3) {
        	   System.out.println("1증가 2)감소 3)종료>>");
        	   int num = sc.nextInt();         }
         
         

       
         

         
         		Scanner sc = new Scanner(System.in);
         		
         		int i = 0;
         		
         		System.out.print("1) 원하는 기호를 입력하세요. >>> ");
         		String sign = sc.next();
         		
         		System.out.print("2) 반복 횟수를 입력하세요. >>> ");
         		int loop = sc.nextInt();
         		
         		while (i < loop) {
         			System.out.printf("%s", sign);
         			i++;
         		}
         		System.out.println();
         		
         		int allCount = 0;
         		int inputValue = 1;
         		while(inputValue != 3) {
         			
         			System.out.print("1)증가 2)감소 3)종료 >>> ");
         			inputValue = sc.nextInt();
         			
         			if (inputValue == 1) {
         				System.out.printf("카운트 : %d\n", ++allCount);
         			} else if (inputValue == 2) {
         				System.out.printf("카운트 : %d\n", --allCount);
         			}
         		}
         		System.out.printf("프로그램 종료!!! 최종 카운트 : %d", allCount);
         	}

         }

		
	}

}
