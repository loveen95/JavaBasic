package oopExam;
class Car2{
	String color;
	String gear;
	int door;
	
	Car2(){	
		this("white","auto", 4);
		//밑으로  호출
	}
    Car2(String color, String gear, int door){
		this.color = color;   
		this.gear = gear;
		this.door = door;
	}
}


public class CarTest2 {

	public static void main(String[] args) {
        
	Car2 c1 = new Car2(); 
	
//	c1.color = "white";  
//	c1.gear = "Auto";
//	c1.door = 2;
//	
//	Car2 c2 = new Car2("black","Auto",4); //
	
	System.out.println("c1의 차량색상은" + c1.color);
//	System.out.println("c2의 차량색상은" + c2.color);

	}

}
