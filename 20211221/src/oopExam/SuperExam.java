package oopExam;

class Parent{
	int x = 10;
}
class Child extends Parent{
	int x = 20;
	void method() {
		System.out.println("x=" + x); //자식의것
		System.out.println("this.x=" + this.x); //자식의 부모를 통해
		System.out.println("super.x=" + super.x); //부모롤 바로 가르킨다.
	}
}
public class SuperExam {

	public static void main(String[] args) {
	//super 와 this는 static 에서는 사용할수 없다.
		
		Child c = new Child();
		c.method(); 
		
		
	}

}
