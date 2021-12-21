package arrayExam;

public class ArrayExam {

	public static void main(String[] args) {
		/*array 배열 - 같은 타입의 여러 변수들을 하나의 묶음으로 다루는 방식 
		 *          - 배열은 생성시 정한 갯수를 수정 할 수없다!!!!!!!!
		 *          - 기본적으로 배열은 0으로 초기화 되어 생성 된다.
		 * int[] score = new int[5];  
		 * String[] name = new String[5];
		 * 
		 * 
		 * 
		 * 
		 * */
//        int[] score = new int[5];
//   
//       
//        for(int i = 0; i <= 5; i++) 
//        	   System.out.println(score[i]);
//        
//     	  
//        	score[0] = 10;
//        	score[1] = 20;
//        	score[2] = 30;
//        	score[3] = 40;
//        	score[4] = 50;
//        	
//        	  for(int i = 0; i <= score.length; i++)
//           	   System.out.println(score[i]);
           
        	
   
	          
//int[]  math = new int[5];
//for(int j = 0; j <math.length ; j++) {
//	math[j] = j * 10 + 50 ;  
//}
//for(int j= 0; j < math.length;j++) {
//	System.out.println(math[j]);
//}
//배열의 길이를 수정하는 방법
//1. 더 큰 배열을 새로 생성한다.
//2. 기존 배열의 데이터들을 새로 생성한 배열로 복사한다.
//  
//	int[]arr = new int[5];
//	
//	for(int i = 0 ; i < arr.length; i++ ) {
//		arr[i] = i+1;
//	}
//System.out.println("배열 수정 전");
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println("arr[" + i +"]: " + arr[i]);
//		}
//		
//		System.out.println("배열 수정 후");
//		
//		int[] tmp = new int[arr.length * 2];
//		
//		for(int i = 0; i < tmp.length; i++) {
//			tmp[i] = arr[i];
//			System.out.println("tmp[" + i+"]: " + tmp[i]);
//		}
//		arr = tmp;
//		System.out.println("배열 수정 후 arr");
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println("arr[" + i+"]: " + tmp[i]);
//		}
//		char[] abc = {'A','b','c','d'};
//		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
//		System.out.println(abc);
//		System.out.println(num);
//		
//		              //2개의 배열을 붙여서 하나의 배열
//		char[] result = new char[abc.length+num.length]; 
//				System.arraycopy(abc, 0, result, 0, abc.length);
//				System.out.println(result);
//				System.arraycopy(num, 0, result, abc.length, num.length);
//				System.out.println(result);
//				System.arraycopy(abc, 0, num,0, abc.length);
//				System.out.println(num);
//				System.arraycopy(abc, 0, num,6, 3);
////				System.out.println(num);
//				
//				//학생 5명의 총점 합계 점수와 평균을 구하시오.
//				int[] score = {100,88,98,60,96};
//				
//				int sum = 0;
//				double avg = 0;
//				
//				for (int item : score) {
//					sum += item ;
//				}
//				avg = sum / score.length;
//				System.out.println("총합:" + sum );
//				System.out.println("평균:" + avg );
		
		//배열 :444657953
		
//		int[] numArr = {4,4,4,6,5,7,9,7,5,3}; //실제 데이터
//		int[] counter = new int[10]; 
//		// counter[numArr[i]]= counter[numArr[i]]+1;
//		
//		for(int i = 0; i <numArr.length;i++) {
//			counter[numArr[i]]++;  
//		}
//		for(int i = 0; i <numArr.length; i++) {
//			System.out.println(i+"의 갯수:" + counter[i]);
////		}
//	String[] name = new String[3];//길이가 3인 String배열 생성
//    name[0] = "kim";
//    name[1] = "song";
//    name[2] = "park";
//    
//    String[] name2= {"kim","song","park"};
//    String[] name3= new String[]{"kim","song","park"};
//    
//    for(String each : name  )
//    System.out.println(each + "");
    
    //char배열과 String 배열을 변환.
//   char[] chArr = {'A','B','C'};
//   String str = new String(chArr);   
//   char[] tmp = str.toCharArray();
		//Quiz src라는 String에 "ABCDE"를 만들어
		//chArr이라는 char[]로 변환하여 출력
		
		String src = "ABCDE";
		
		for(int i = 0; i<src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"):" +ch);
		}
		//char[] tmp = src.toCharArray();
		
	
		
		
		

     
    
    
    
    
    
    
    
}
}

