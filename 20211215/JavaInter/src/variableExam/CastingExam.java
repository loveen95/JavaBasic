package variableExam;

public class CastingExam {
	public static void main(String[] args) {
		/* Casting - 형 변환 자료형의 타입을 일치시킨다. 
		 * '형변환이란 변수 또는 상수의 타입을 다른 타입으로 변환하는것'
		 * 예 ) int 값 double을 계산하려면 먼저 두 값을 같은 타입으로 변환후 계산한다.
		 
		 *
		 *
		 *               (타입)피연산자
		 *             괄호()는 '캐스트 연산자' '형변환 연산자'
		 *             double d = 85.4;
		 *             int score = d ; (X)
		 *             int score = (int)d; (O) 
		 *             int score = 85; //정수형이기 때문에 85만 들어간다. .4는 날라감 
		 * 
		 * boolean을 제외한 나머지 타입들은 서로 형변환이 가능하다.
		 * 기본형과 창조형간의 형변환은 불가능하다.
		 * 
		 * (정수형간의 형변환)
		 * 큰 타입에서 작은 타입으로 변환 -> int 의 값을 byte타입으로 변경 하는 경우에는 그 크기의 차이
		 * 만큼 잘려(손실) 나간다. 경우에 따라 값 손실 'loss of data'이  발생할 수도 있다.  
		 * 작은 타입에서 큰 타입으로 변환 -> byte에서 int로 변환하면 잘려나가는 일이 없다. 따라서 
		 * 값 손실이 일어나지 않는다. 나머지 빈공간들은 0도는 1로 채워진다. 
		 * 
		 * 
		 * (정수와 실수형 간의 형변환)
		 * 정수와 실수형 간의 형변환은 완전히 다르기 때문에 정수형간의 변환처럼 간단히 처리 할수 없다.
		 * - 정수형를 실수형으로 형변환
		 * - 실수형을 정수형으로 형변환
		 * - 자동 형변환
		 *   서로 타입간에 대입이나 연산을 할때는 형 병환을 통해 일치시키는 것이 원칙이다. 
		 *   경우에 따라 생략할수도 있다. 이것은 형변환을 하지 않는게 아니라 자바가 형변환을
		 *   해주는 것이다.		 
		 *   
		 *   특히 계산할때 자동 형변환이 많이 일어난다.연산과정에서 자동으로 형변환이 이루어지는것을
		 *   '산술 변환'이라고 한다. 
		 *   자동 형변환 값을 최대한 보존 할 수 있는 타입으로 자동 형 변환 한다. 
		 *    
		 *    */
		
//		int i = 91234567;
//		float f = i;
//		
//		int i2 = (int)f;
//		
//		double d = i;
//		
//		//int i3 = d;(X)
//		int i3 = (int)d;
//		
//		
//		System.out.println();
		
//		float f = 1234; 
//		
//		System.out.println(f); // 결과 = 1234.0 (자동으로 형 변환)
//		
//		byte b = (byte)1234;
//		System.out.println(b); //결과 = -46
//		
		
		int i = 3;
		double d = 1.0;
		
		double s = i + d;
		System.out.println(s); //계산할때 자동 형변환이 많이 일어난다.
		
//		double d = 85.4;
//		//int score = d ; 
//		int score = (int)d;
//		System.out.println(score); //결과 = 85 

//		int i = 10;
//		byte b = (byte)i;
//		
//		System.out.printf("[int]->[byte] i=%d -> b=%d%n",i , b);
//		i=300;
//		b=(byte)i ;
//		System.out.printf("[int]->[byte] i=%d -> b=%d%n",i , b);
//		
//		b= 10;
//		i = (int)b;//굳이 안해도됨 
//		System.out.printf("[byte]->[int] b=%d -> i=%d%n",b , i);
//		
//		b = -2;
//		i = (int)b;
//		System.out.printf("[byte]->[int] b=%d -> i=%d%n",b , i);
//		
//		float f= 9.1234567f;
//		double d = 9.1234567;
//		
//		//double d2 = f;
//		  double d2 = (double)f;
//		
//		System.out.println(d2);
//		System.out.printf("d=%-10.2f%n입니다.", d2);
//		
		
		
		
		
	}

}
