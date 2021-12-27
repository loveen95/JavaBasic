package functionsExam;
class Card {
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	Card(String kinf , int number){
		this.kind = kind;
		this.number = number;
	} 
}
public class TostringExam {

	public static void main(String[] args) {
		//String ()객체에 대한 정보(객체 변수에 저장된 값들)를 문자열로 변환하는 메서드 
		
		Card c1 = new Card();
		Card c2 = new Card(); 
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		//카드 객체 2개 생성후 각 객체에 toString을 호출 하였다.
		//그 결과 해쉬코드로가 출력됬다. 클래스의 이름은 같아도 
		//객체는 다르다는것을 확인 할 수 있다. 
		
		
	}

}
