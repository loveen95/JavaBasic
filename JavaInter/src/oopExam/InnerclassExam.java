package oopExam;

public class InnerclassExam {
     class InstanceInner {
	     int iv = 100;
	     //static int cv = 100; //에러 static 사용 불가  감추고 싶을때 
	     final static int CONST = 100;
     }
     static class StaticInner{
    	 int iv= 200;
    	 static int cv = 100; //static 클래스에서는 사용 가능
     }
	public static void main(String[] args) {
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	/*Inner Class 내부 클래스 - 클래스 안에 선언된 클래스, 두 클래스가 아주 긴밀한 관계에 있을때 사용된다.
	  내부 클래스로 선언하면 두 클래스 간에 서로 쉽게 접근할수 있는 장점과 외부에서는 불필요한 클래스를 감춤으로 코드의 복잡성을
	  줄일수 있다.(캡슐화)
	
	class A{}     class A{
	                   class B{
	 class B{}            }
                  }//이때 class A외에는 class B를 거의사용하지 않는다. 
                  
	*내부 클래스 두분 - 인스턴스 클래스, 스태틱 클래스 ,지역 클래스 ,익명 클래스(이름없는 1회용..)
	*
	*내부 클래스 선언 - 변수 선언과 비슷 , 변수 선언 위치에 따라 인스천스 변수, 클래스 변수, 지역변수로
	*              나누듯이 내부 클래스도 선언 위치에 따라 
	*              같은 선언위치의 변수와 동일한 유효범위와 접근성을 갖는다.
	*
	*class Outer{                          class Outer {
	*                                        class InstanceInner {
	*                                         stataic class StaticInner{}
	*                                         
	*                                         void myMethod() {}
	*                                         class LocalINner                                    }
	*  int iv = 0;                             }
       *  static int cv = 0;                  } 
	*  
	*  void myMethod(){
	*  int iv = 0;
	*    }
	*  }
	*
	*
	*/
	}

}
