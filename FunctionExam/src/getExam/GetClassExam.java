package getExam;

final class Card{
	String kind;
	int num ;
	Card() {
		this("SPADE", 1);
	}
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	@Override
	public String toString() {
		return kind + ":" + num;
	}
}

public class GetClassExam {
	

	public static void main(String[] args)throws Exception {
		Card c = new Card("HEART", 3);
		Card c2 = Card.class.newInstance();  
		
		
		
		System.out.println(c);
		System.out.println(c2);
		
		
			
		/*자신이  속한 클래스의 class객체를 반환하는메서드
		 * class객체는 클래스의 모든 정보를 담고 있다. 클래스 파일이 메모리에 올라갈때
		 * 자동으로 생성된다.  
		 * 	
		 */
		

	}

}
