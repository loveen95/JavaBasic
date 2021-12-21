package oopExam;

public class OOPExam {

	public static void main(String[] args) {
		//객체 지향의 핵심은 '실제 세계는 객체로 이루어져 있고 발생하는 모든 사건들은 객체들간의 상호작용이다.'
		//실제 세계를 컴퓨터 속에 옮겨 놓은 것과 같은 가상 세계를 구현하고 이를 통해 많은 비용과 시간을 절약할수 있다.
    
		//객체지향(OOP) 언어의 특징 - 재사용성, 유지보수, 중복 코드 제거 
		//1.코드의 재사용성이 높다. 새로운 프로그램을 만들때 기존에 만들어 놓은 코드를 그대로 가져다가 쓸 수 있다.
		//2.코드의 관리가 용이하다. 코드들 간의 관계를 이용하여 적은 노력으로 쉽게 코드를 업데이트 할 수 있다.
        //3.신뢰성이 높은 프로그래밍을 가능하게 한다.
		//4.코드의 중복을 제거하고 새로운 코드 작성에 따른 오작동을 미연에 방지할수 있다.
		
		
		
		//     <클래스와 객체>
		
		//클래스의 정의 - 클래스는 객체를 정의한다. 
		//클래스의 용도 - 클래스는 객체를 생성한다.
		
		//객체의 사전적 의미는 '실제로 존재하는 것'
	    //객체의 정의 - 실제로 존재 하는 사물 또는 개념	
		//객체의 용도 - 각 개체들의 기능과 속성에 따라 달라진다.
	    
		//유형의 객체 - 책상 ,자동차, TV...등의 사물
		//무형의 객체 - 수학 공식, 프로그램 에러 등의 논리나 개념 
		
		//클래스 - 자동차 설계도, 붕어빵 기계
		  //객체 - 자동차, 붕어빵
		
		//클래스릃 한번만 제대로 만들기만 하면 매번 객체를 어떻게 만들까 고민할 필요가 없다. 
		
		
		//        <객체와 인스턴스>
		//객체- 단독으로 표현 할때 사용하는 명칭
		//인스턴스- 클래스와의 연계된 표현이 필요할 경우 사용된다.
		
		//예) 책상은 객체다(O), 책상은 인스턴스다(x) 
		   //책상은 목수 클래스로 만든 인스턴스다(O), 책상은 목수 클래스롤 만든 객체이다(X)
		
		//객체의 구성 요소(속성property, 기능function)
		      //속성 - 변수, 특성, 필드, 상태
       		      //기능 - 메서드, 함수, 행위
		
		//TV객체 1)속성 - 크기, 너비, 높이, 색상....
		     //2)기능 - 켜기, 끄기, 채널변경, 볼륨변경 등등....
		
		
		//객체 생성 방법 
		  //Tv t= new Tv(); //Tv클래스 타입의 참조변수 t를 선언하여 
		                    //Tv 인스턴스를 생성한후 생성된 TV인스턴스의 주소를 t에 저장한다.
		
		
		
		//            <**객체 배열**>
		//많은 수의 객체들을 다뤄야 할때 배열로 사용하면 더욱 편리하다. 
		//예) 게시물 객체들을 배열로 모두 담아 처리하면 수월하게 게시판 관리를 할수 있다. 실제 객체들이 배열에 저장되는것이 
		   //아니라 실제 객체들이 위치한 위치값을 저장하게 된다.
		
		Tv[] tvArr = new Tv[3];
		 for(int i = 0; i < tvArr.length ; i++ ) {
			 tvArr[i] = new Tv();
			 tvArr[i].channel = i + 10;
		}// tvArr[i]의 channel에 i+10을 저장
		for(int j = 0; j < tvArr.length; j++) {
			tvArr[j].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", j, tvArr[j].channel);
		}
			 
		 }
		
		
	}

class Tv {
	String color;
	boolean power;
	int channel;
	void power() {
		power = !power;
	};
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
