package controlExam;
import java.util.Random;
import java.util.Scanner;
public class IfExam {

	public static void main(String[] args) {
		/* 제어문 Control Statement - If Switch 
		 * 코드의 제일 위에서 부터 아래로 한 문장씩 순차적으로 진행되는 프로그램의 흐름을 조절하여 일부분은
		 * 건너뛰기도 하고 다시 위에서부터 내려올수 있게 제어한다.  
		 * 
		 * if (score > 60) {
		 * System.out.println("합격"); 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
//		*/
////		int score =80;
////		if (score > 60) { // 80 > 60 -> true
////			  System.out.println("합격입니다."); 
////	      }
////		
		

	
/* (90 <= x && x <= 100) 점수 x가 90점 이상 100점 이하 동시만족
 * (x < 0 || x > 100) 정수 x가 0미만 또는 x가 100초과 하나만 만족 
 * x % 3 == 0 && x % 2 != 0 x가 3의 배수이기는 하지만 2의 배수는 아닌 조건 
 * depar == "영업부" || depar == "기획부" 영업부와 기획부만 조건
 * 
 * 
//// * */	
////  if (true) {
//	  System.out.println("welcome"); //블락이 없으면 if 조건의 한줄만 실행된다. 블락을 꼭 쓰자 
//      System.out.println("hello");
//////  }
//  
/*if - else  구문
 * else는 그 밖의 나머지 모든것... 
 * 
 * if(조건식){
 *    true.....
 * } else {
 *    else.....
 * }
 * 
 * 
 * */
  
  /*if - else if 구문
   * if else는 는 분기가 2개로 수행되는 구조인반면 처리해야할 경우의 수가 3개 이상이면 else if  
   * 조건식을 만족 하면 더이상은 다른 조건식을 확인하지 않는다. 
   * if(조건식){
   *    true.....
   * } else if{
   *    true.....
   *} else {
   *    else...      
   *}
   * 중첩 if는 좋은 방법이 아니다. 
   *  if(조건식){
   *    true.....
   * } else if(조건식2){
   *    true.....
   *} else {
   *     if (조건식{
   *     true....
   *     } else {
   *     else....
   *     }     
   *}
   * 
   * */
  
   //Quiz정수를 입력 받아 98 이상이면 A+, 94이상이면 A, 90이상이면 A- 
  
  
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
//		
//		if (score >=90) {
//			System.out.println(score>=98?"A+":score>=94?"A":"-A");
//		}else if(score >=80) {
//			System.out.println(score>=88?"B+":score>=84?"B":"-B");
//		}
//			
//	
/*
 * 
 * 
 * switch 구문
 * if문의 경우 항목이 많아질수록 가독성이 떨어진다 . 
 * 평균적인 처리 시간도 항목이 늘어날수록 길어지게 된다. 
 * 이러한 if문과는 달리 switch는 보다 간결하고 알아보기 쉽게 가독성이 뛰어나다. 
 * 보통 처리해야하는 경우의 수가 아주 많을 경우에 Switch 를쓰고   Switch만든 모든 구문은 if구현할수 있지만 if만든 
 * 모든 구문을 Switch는 구현할수 없다. 
 *  1.조건식을계산
 *  2.조건싣을 만족하는 case문으로 이동한다.
 *  3.해당 case문의 구문들을 실행한다.
 *  4.break;을 만나기 전까지 모든 구문을 전부 실행한다.
 * switch 구문의 조건식의 결과는 정수 또는 문자열이다. 
 * 
 * 
 * 
 * */
//		# 특정 월을 입력 받아서 3,4,5는 봄 6,7,8은 여름 9,10,11은 가을 12,1,2는 겨울
//		"?월의 계절은 ?입니다."
//		조건  Switch구문의 총 줄의 수는 10줄 내외로 작성하세요
		
//		Scanner scan = new Scanner(System.in);
//		int month = scan.nextInt();
//		String season = "";
//		
//		switch(month) {
//		
//		case 12 : case 1: case 2:
//		season = "겨울";
//			break;
//		case 3 : case 4 :case 5:
//			season = "봄";
//			break;
//		case 6 : case 7: case 8:
//			season = "여름";
//			break;
//		case 9 : case 10: case 11:
//			season = "가을";
//			break;
//		}		
//  System.out.println(month+"의 계절은"+ season +"입니다.");

		//#Quiz 가위(1)바위(2)보(3) 게임 
//		"가위(1)바위(2)보(3)"중 하나를 입력하세요" > 가위(1)
//			당신은 가위이고 컴퓨터는 컴퓨터는 바위 입니다. 
////			켬퓨터가 이겼습니다. 
//		"가위(1)바위(2)보(3)"중 하나를 입력하세요" > 가(1)"
//		당신은 가위 이고 컴퓨터는 보입니다. 
//		당신이 이겼습니다. 
//		"가위(1)바위(2)보(3)"중 하나를 입력하세요" > 가(1)"
//		당신은 가위 이고 컴퓨터는 가위입니다. 
//		비겼습니다. 
   
	
//	Scanner scan = new Scanner(System.in);
//	Random random = new Random();
//	System.out.println("가위바위보중 하나를 입력하세요>>>");
//	
//	
//    int com = 1 + random.nextInt(3);
//    int human = scan.nextInt();
//    System.out.printf("당신은{}이고,컴퓨터는 {}입니다.", com,human);
//   
//    
//
//
//	
//	switch (human-com) {
//	case 2 : case -1 :
//		System.out.println("컴퓨터가 이겼습니다.");
//		break;
//		
//	case 1 : case -2 : 
//		System.out.println("당신이 이겼습니다.");
//		break;
//	case 0: 
//		System.out.println("비겼습니다.");	
//		
//	
//	}
//	
//	if 
//	System.out.println("당신은"+game +"이고 컴퓨터는" + random + "입니다.");
		
//		# 주민등록번호을 입력하세요 > 000000-0000000
//		  "당신은 남성입니다.""당신은 여성입니다."
		Scanner scan = new Scanner(System.in);
		char i;
		System.out.println("주민등록번호를 입력하세요");
		i = scan.nextLine().charAt(7);
		
		
		
	   switch (i) {
 	   case '1' : case '3' :
 		   System.out.println("당신은 남성입니다.");
 		   break;
 		   
 	   case '2' : case '4' :
 		   System.out.println("당신은 여성입니다.");
 		   break;
	   }
 	   
	
	}
}
