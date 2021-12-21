package edu.gt.cs;
import java.util.*;

public class Test {
   public static void main(String[] args) {
      
   // edu.gt.cs.Test
   
   // 패키지는 여러개가 있을 수 있고 하나의 패키지 내에는 자바 클래스 파일을 여러 개 가질 수 있다.
   // edu 패키지 아래에 gt패키지 아래에 cs패키지 안에 Test라는 클래스가 위치하고 있다.
   
   // 자바에서의 데이터 종류를 설명...
   // 논리형 boolean은 true와 false 값을 가진다.
   // 정수형 integer에는 int, long, short, byte가 있다.
   // 실수형에는 double과 float가 있다. 
   // 문자에는 String과 char형이 있다.
   
   //for (int i = 0; i <= 3; i++) {
      // System.out.println(i);
      
      // 정수형 i의 시작값은 0이고 3보다 같거나 작고 1씩 증가한다.
      // i = 0 = (0) + i = 1 = (1) i + 2 = (2) + i + 3 = (3) = (6)
      
      // i = 0일때 조건 3보다 작거나 같음을 만족하므로 i값 0을 출력 T
      // i = 1일때 조건 3보다 작거나 같음을 만족하므로 i값 0을 출력 T
      
      // i = 4일때 조건 3일때 작거나 같음을 만족하지 못하므로 for문을 종료한다. T
      
      // 0 T
      // 1 T
      // 2 T
      // 3 T
      
      
//      int[] n1 = new int[5];
//      // n1(변수:주소)에 {0,0,0,0,0} length(5)
//      
//      int[][] n2 = new int [2][2];
//      // n2(변수:주소)에 {{0,0},      length(2)
//      //             0,0}}
//      
//      int[] n3 = {1,2,3};
//      // n3(변수:주소)에 {1,2,3}       length(3)
//      
//      int x = 100;
//      int y = 200;
//      int z = x + y;
//      // 정수형 변수 x와 y를 더해 정수형 변수 z에 저장한다.
//      // 메모리(ram)에 있는 변수들의 값을 cpu가 가지고 와서 산술 연산을 하여 다시 메모리에 저장한다. T
//      
//      int age = 23;
//      String name = "kim";
//      String x = name + "의 나이는" + age;
//      // 정수형 변수 x값에 변수 name과 age를 산술 연산하여 저장한다.
//      // 메모리(ram)에 있는 변수들이 값을 cpu가 가지고 와서 결합 연산을 하여 다시 메모리(ram)에 저장한다. T
//      
//      Scanner sc = new Scanner(System.in);
//      System.out.println("이름을 입력하세요>>"); // -1
//      String name = sc.next();          // -2 
//      System.out.println("나이를 입력하세요>>"); 
//      int age = sc.nextInt();             // -3
//      // 스캐너라는 객체를 만들고 문자형 변수 name을 입력 받으면 "이름을 입력하세요"를 출력하게 한다.
//      // 스캐너라는 객체를 만들고 정수형 변수 age을 입력 받으면 "나이를 입력하세요"를 출력하게 한다.
//      
//      // 1. 화면에 사용자로 하여금 이볅하도록 프롬프트를 출력한다. T
//      // 2. 사용자가 콘솔에서 스트링(문자열)으로 입력한 값을 변수 name에 저장 T
//      // 3. 입력한 스트링(문자) 나이 데이터를 정수로 변경하여 age변수에 저장 T
//      
//      String h = "안녕하세요"; //참고 : 한글은 1글자가 2byte
//      // 10byte(string) + 10byte(char) = 20byte
//      
//      int n = Integer.parseInt("100"); //문자열, 정수, 스트링
//      Scanner sc = new Scanner(System.in); //키보드, 생성
//      Random r =new Random(10); //랜덤, 생성
//      //100이라는 문자열(스트링)을 계산이 가능한 int 형으로 변경(변환) 하여 변수명n에 저장
//      //키보드를 통해 입력을 받을 수 있는 Scanner 객체 sc생성 
//      //시드 값 10으로 랜덤한 값을 생성 할 수 있는 객체 r을 생성
      
//      당신의 정보를 입력하세요.
//      
//       당신의 부서는 >>>
//       당신의 소속은   입니다. 
//       당신의 나이은 >>>
//       당신의 작년나이는 49이였습니다.
//       달신의 키는 >>
//       당신은 키가 (크다/보통이다/작다) // 키가 180 이상이면 크다. 170 이상이면 보통이다. 나머지는 작다.
       
	   System.out.println("당신의 정보를 입력하세요.");
	   Scanner scan = new Scanner(System.in);
	   System.out.println("당신의 부서는>>>");
	   String boo = scan.nextLine();
	   int age = scan.nextInt();	   
	   System.out.println("당신의 나이는>>>");
	    int lastage = scan.nextInt();
	    System.out.println("작년나이는 "+ lastage + "이였습니다.");
	    int hei = scan.nextInt();
	    System.out.println("당신의 키는 >>>");
	    int ke = 180;
	    if (hei > ke) {
	    	System.out.println("당신의 키가 크다.");
	    }else if (hei <= ke) {
	    	System.out.println("당신의 키가 작다.");
	    }else {
	    	
	    }
	    }
   
}