package pack01;
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in); //키보드로부터 입력을 받게해준다.
	System.out.println("건강검진을 위해 회원의 정보를 입력해주세요."); //제일 먼저 나오는 출력문
	
     System.out.println("당신의 소속은 >>");
     String name = sc.next();
     System.out.println(name + "\n당신의 소속은" + name+"이시군요!" );    
     System.out.println("당신의 나이는 >>");
     int age = sc.nextInt();
     System.out.println(age + "\n당신의 작년 나이는" + (age -1) +"세 이시군요!" );
     
     int weight = 90;
     System.out.println("현재 당신의 몸무게는? >>");  
     weight = sc.nextInt();
        int i = 0;;
    
      if (weight >i) {
    	 
    	  System.out.println( i + "과체중");
      }else if(weight < 90 && weight > 70) {
    	 
    	  System.out.println( i +"보통");
      }else {
    	  System.out.println("미달");
    	  System.out.println("당신은 지금 " + i + "이시군요!");
      }
      
      
      
      
   

      }



}

