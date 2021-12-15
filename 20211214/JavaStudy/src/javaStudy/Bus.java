package javaStudy;

public class Bus extends Car{
	
	
	public void ppang() {
		System.out.println("PPANG!!!!");
	}
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();       // 자식은 가져다 쓰고 직접 추가해 쓸수 있다. 
		bus.ppang();
		car.ppang();//부모클래스로 만든 인스턴스 car는 부모 즉 자식의 자원을 쓸수 있지만 
		            //자식 즉 bus의 메소드는 사용할 수 없다.
	
		
				
	}
 
}
