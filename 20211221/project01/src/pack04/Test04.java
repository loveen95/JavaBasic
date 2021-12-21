package pack04;
import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다."); //출력문
//		System.out.println("단수는? : ");//출력문
		int num = sc.nextInt();// 입력문
//		for (int i = 1; i <= num ; i++) {//반복해서 증가해줘야하 하기때문에 for구문을 쓴다.
// 			for (int j = 0; j < i; j++){// j 는 별의 갯수를 의미하므로 하나씩 증가해야하므로 i보다 작아야한다.
// 				System.out.print("*"); //* 표시
// 			}
// 			System.out.println();
 			
 			
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다."); // 출력문
		System.out.println("단수는? : "); //출력문
        int num = sc.nextInt(); // 입력문
        

		 for (int i = 5; i >= 1 ; i--) { //i는 하니씩 감소해야한다.
		 	for (int j = 0; j < i; j++){ // 별은 하나씩 증가해야하므로 j++
		 		System.out.print("*");
		 	}
		 	System.out.println();



	}
     
        
	}
	}


