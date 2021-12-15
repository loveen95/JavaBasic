package inter;


public class ZoomKeeper {
	
public void feed(Predator predator) {
    System.out.println("feed"+ predator.getfood());//입력만 있는 메서드
    
    //객체가 한개 이상의 자료형 타입을 갖게 되는 특성을 <다형성>이라고 한다.
}
//	public void feed(Tiger tiger) {
//		System.out.println("feed apple");
//	}
//	public void feed(Lion lion) {
//		System.out.println("feed banana");
//	}
//	
	public static void main(String[] args) {
	ZoomKeeper zoomkeeper = new ZoomKeeper();
	
	Tiger tiger = new Tiger();
	Lion lion = new Lion();
	
	
	zoomkeeper.feed(tiger);
	zoomkeeper.feed(lion);
	}

}
