package controlExam;

public class ForExam {

	public static void main(String[] args) {
		/*For 반복문 : 어떤 작업을 반복적으로 수행되도록 할때 사용
		 * 반복횟수를 정확히 특정할때 주로 사용한다.
		 * 문법이 직관적이라 가독성이 좋다. 
		 *          for (start; stop; step)
		 * start -> 조건식 ->수행 문장들...->증감식
		 *       -> 조건식 ->수행 문장들...->증감식 
		 *       -> 조건식 ->수행 문장들...->증감식  
		 *       -> 조건식 ->종료 
		 *       
		 * 초기값 : 반복문에 사용할 변수를 초기화 처음에 딱 한번만 실행된다.
		 *         보통은 변수를 하나만 사용하지만 2개 이상 사용 가능하다.
		 *         
		 *          for(int i =1, j=0; i<10; i++){}
		 * 조건식 : 조건식의 값이 참일경우 계속 반복하다가 거짓이되는경우 반복 종료한다.
		 *        한번도 실행되지 않는 경우가 발생할 수도 있고, 영원히 반복되는 경우가 발생할 수 있다.(무한루프)         
		 * 증감식 : i++, i--,i += 2(i = i + 2)
		 *        초기값 ,조건식, 증감식은 전부 혹은 하나도 생략 가능하다.           
		 *    for(;;)무한 반복 ..... 
		 * */
		
		
//		1부터의 5까지를..12345라고 한번 찍고 12345라고 찍어라
		
//		
//		for(int i = 1 ; i <= 5; i++) {
//			
//           System.out.println(i);
//		   
//		}
//		for(int i = 1 ; i <= 5; i++) {
//			
//	           System.out.print(i);
//			   
//			}
		
		
		//#1~10까지의 합을 출력하시오 누적값을 출력하시오 
		
		
//		int total = 0;
//		for (int i =1 ; i <= 10; i++ ) {
//			System.out.printf("1부터 %d까지의 합 : %d%n",i,total += 1 );
//			
//		}
		
//		for(int i = 1,j = 10 ; i <= 10; i ++, j--) {
//	
//			System.out.printf("%d\t%d\n",i,j);
//		}
		
		//99단을 출력 하세요
		
//		2 * 1 = 2  2 * 2 = 4
		
//		for (int i = 2;  i <= 9; i++ ) {
//			for(int j= 1; j <= 9; j++) {
//			System.out.printf("%d *%d = %d\t",i,j,i*j);
//			
//		}
//		System.out.println();
//		}	
//		 
//		int num = 5;
//		
//		for (int i = 0; i <= 5 ; i++) {
//			for (int j = 0; i <= j; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//			
//	int num = 5;
//		
//		for (int i = 1; i <= 5 ; i++) {
//			for (int j = 5; j >= 1; j--){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//향상된 for 구문 - for each
		 //for (타입 변수명: 배열 또는 컬렉션) {
			 
//		 }
		
   int[] arr = {1,2,3,4,5};
            
//    for(int i = 0; i < arr.length; i++){
//    	//System.out.println(arr[i]);
//    }
//		}
		//for (타입 변수명: 배열 또는 컬렉션
   int count = 0;
	int sum = 0;	
   for(int i : arr) {
			System.out.println(i);
			sum += i;
			count++;
   }	
			System.out.printf("총합은 %d입니다.\n", sum);
			System.out.printf("갯수는 %d입니다.\n", count);
		 

}
}
