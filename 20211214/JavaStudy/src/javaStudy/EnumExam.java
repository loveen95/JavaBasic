package javaStudy;

public class EnumExam {
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	//static객체 생성 없이도 접근 하여 사용 허용
	//final 상수로 선언 
	//String 문자열로 
	//상수형태로 선언 할 경우에는 대문자로 사용한다.
	

	public static void main(String[] args) {
		String gender1; //변수 선언
		
		gender1 = EnumExam.MALE; //객체없이 클라스명으로도 선언한다.static은 
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		gender2 = "girl";
		gender2 = 1; 	
	}

}

//열거형  
enum Gender{
	MALE, FEMALE; 
}
