package classesExam;
import java.util.Random;
public class RandomExam {

	public static void main(String[] args) {
/*
 * 난수를 구하는 Math.random()와의 가장 큰 차이점은
 * 종자값 (seed)을 설정 할수 있다는 것이다. 종자값은 같은 Random 객체들은 항상 같은 난수를 
 * 갖는다. 같은 공식에 같은 값을 넣으면 같은 결과를 얻는 것과 같이 같은 난수를 얻게 된다. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
		Random rand = new Random(10); //seed 값 10 설정 //난수가 10개가 생기는게 아니다.
		Random rand2 = new Random(10);
		
		for(int i = 0; i < 3; i++)
			System.out.println(rand.nextInt());
		
		System.out.println();
		
		for(int j = 0; j < 3; j++)
			System.out.println(rand2.nextInt());
		
		
		
		
		

	}

}
