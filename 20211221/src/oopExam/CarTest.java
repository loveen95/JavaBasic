package oopExam;
class Car{
	String color;
	String gear;
	int door;
	
	Car(){		
	}
    Car(String c, String g, int d){
		color = c;
		gear = g;
		door = d;
	}
}


public class CarTest {

	public static void main(String[] args) {
        
	Car c1 = new Car(); 
	
	c1.color = "white";  
	c1.gear = "Auto";
	c1.door = 2;
	
	Car c2 = new Car("black","Auto",4); //
	
	System.out.println("c1의 차량색상은" + c1.color);
	System.out.println("c2의 차량색상은" + c2.color);

	}

}
