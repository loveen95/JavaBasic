package mathExam;
import java.lang.Math.*;

public class MathExam {

	public static void main(String[] args) {
/*Math는 기본적인 수학 계산에 유용한 메서드로 구성되어 있다. Random() round()....
 * Math의 생성자는 접근제어자가 private()d이기 때문에 다른 클래스에서는 Math객체를 생성할수 없다.
 * Math의 메서드는 모두 static -> 직접 접근 Math.round()
 * 
 * 올림 버림 반올림 round() 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/		
//		double val = 90.7552; 
//		System.out.println(Math.round(val)); //반올림 
//		
//	
//		System.out.println(val);
//		System.out.println(Math.round(val)); //반올림
//		System.out.println(Math.ceil(val)); //올림
//		System.out.println(Math.floor(val)); //버림 
//		System.out.println(Math.ceil(val)); //올림
//		
//		System.out.println();
//		System.out.println(Math.round(val*100)/100); //반올림
//		System.out.println(Math.ceil(val*100)/100); //올림
//		System.out.println(Math.floor(val*100)/100); //버림 
//		System.out.println(Math.ceil(val*100)/100); //올림
//		
//		
//		System.out.println();
//		
//		String val2 = String.format("%.2f", val);
//		System.out.printf(val2);
		
		double d = Math.random();
		System.out.println(d*100);
		//random() 0.0 <= d < 1.0 , 즉 %값 형태로 난수를 발생 시킨다. 
		
	    int i = (int)(Math.random() * 10);
	    System.out.println(i);
	    
	    int j = (int)(Math.random() * 100);
	    System.out.println(j);                      //별로 안중요
			
	}

}
