package oopExam;
class Tv{
	boolean power; //전원
	int channel; //채널
	
	void power() {}//전원 기능
	void channelUp() {} //채널 올림 기능 
	void channelDown() {} //채널 내림 기능 
	
	
}
class CaptionTv extends Tv{
	boolean caption;//캡션
	void caption() {} //기능 추가,  캡션 기능
}

public class CaptionTvExam {

	public static void main(String[] args) {
	CaptionTv tv = new CaptionTv();// 생성자는 없지만 자동으로 자바가 생성해준다.
	  tv.power(); //부모 매서드
	  tv.channel = 11; //부모 변수
	  tv.channelUp(); // 부모 메서드
	  tv.channelDown(); //부모 메서드
	  System.out.println(tv.channel); //자식은 부모기능을쓸수 있다.
	  tv.caption = true;
	  tv.caption();
	  System.out.println(tv.caption); 
	}

}
