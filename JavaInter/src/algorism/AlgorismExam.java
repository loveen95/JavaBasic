package algorism;

public class AlgorismExam {
	static int[] arr = {11,13,17,19,23,29,31} ;

	static public int binarySearch(int key, int head, int tail) {
		
		
	
	int center; 
		while (head <= tail) {
			center = (head + tail) / 2;
			if( key == arr[center]) {
				return center;
			} else if (key < arr[center]) {
				tail = center - 1;
			}else {
				head = center + 1;
			}

		}
		return -1;
			
				}
		

	public static void main(String[] args) {
		int a = binarySearch(17,0,arr.length-1);
		if (a== - 1){
			System.out.println("찾지 못했습니다.");
		} else {
			System.out.println(a + "번째 요소와 일치");
		}
	}
	
	
//		int max = 0;
//		
//		int i = 0;
//		int[] array = {1,2,3,4,5};
//		
//		for (i = 0; i < array.length; i++) {
//			
//			if (array[i] > max ) {
//				System.out.println(max);
//				
//			}
//		} 
		
//		
//		int sum = 0;
//		int[] array = {1,2,3,4,5};		
//		
//		
//		for(i = 0; i < array.length; i++) {
//			sum += array[i]; 
//				
//				
//			}
//		System.out.println(sum);
			
			
		}
			
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a = 11;
//		int b = 55;
//		int w = 0;	
//		
//		w= a;
//		a= b;
//		b= w;
//		
		
//		int a 
		
		//= 0;
//		int b = 0;
//		
//		if(a>b) {
//			System.out.println(a);
//			
//		}else if(a==b) {
//			System.out.println("a와 b는 같다");
//		}else {
//			System.out.println("b가 크다");
//		}
		
//	Scanner scan = new Scanner(System.in);
//	System.out.println("base와 height를 입력하세요>>>>");
//	double base = 0;
//    base = scan.nextInt();
//    double height = 0;
//    height = scan.nextInt();
//    double area = 0;
//    
//     area = base *height / 2.0;
//    	  
//      System.out.printf("Area는 %f입니다.", area);
     
	


