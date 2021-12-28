package classesExam;

public class WrapperExam {

	public static void main(String[] args) {
	/*포장 클래스 wrapper class
	 * 
	 * 매개변수로 객체를 요구할때... 기본형 값이 아닌 객체 저장해야 할떼 ...객체 간의 비교가 필요할때....
	 * 8개의 기본형을 대표하는 8개의 래퍼 클래스를 이용하면 기본형 값을 객체 형태로 다룰수 있다.'기본형을 객체처럼 포장한다는 뜻'
	 * 기본형          Wrapper
	 * 
	 * boolean Boolean     Boolean b = new Boolean(true);
	 * char    Character   Character c = new Character('a');
	 * byte    Byte
	 * int     Integer     Integer i = new Integer(100); Integer i = new Integer("100");
	 * long    Long                
	 * float   Float
	 * double  Double      Double d = new Double(3.14); Double d = new Double("3.14");
	 * short   Short
	 * 
	 * 
	 * */
//          Integer i1 = new Integer(100); //권장하진 않는다. 
//          Integer i2 = new Integer(100);
//          
//          System.out.println(i1 == i2);        //주소 비교  false
//          System.out.println(i1.equals(i2));   //값만 비교 true
//          System.out.println(i1.toString() == i2.toString()); //false
//          
       //래퍼 클래스들은 모두 equals()가 오버라이드 되어 있어서 주소 값이 아닌 객체가 가지고 있는 값을 비교한다.
       //toString()도 오버라이딩 되어 있어서 객체가 가지고 있는 값을 문자열로 변환하여 반환한다.    
          
          int i = new Integer("100").intValue();
          int i2 = Integer.parseInt("100"); //주로 사용되는 방법
          Integer i3 = Integer.valueOf("100");
          
          //둘다 문자를 숫자로 바꿔주는 일을 하지만 전자는 반환값이 기본형
          //후자는 반환값이 래퍼클래스 타입이라는 차이가 있다. 
          
          //JDK 1.5부터 도입된 오토박싱 autoboxing기능 때문에 
          //반환 값이 기본형 일때와 래퍼클래스 일때의 차이가 없어졌다. 성능은 valueOf가 좀 느리다. 
		
		
		
	}

}
