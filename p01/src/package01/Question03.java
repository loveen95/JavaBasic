package package01;
import java.util.Scanner;
public class Question03 {

	public static void main(String[] args) {
		System.out.println("왼쪽 위가 직각인 삼각형을 만드세요.");
		Scanner sc = new Scanner(System.in);
           String line =sc.next();	
		int num = Integer.parseInt(line);
		
		
		
		for(int i = 1; i <= num ; i++) {
			for(int j = 0; j <+ i ; j++)
				System.out.print("*");
		}
              System.out.println();
	}
}
