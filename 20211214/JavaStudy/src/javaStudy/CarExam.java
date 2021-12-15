package javaStudy;

public class CarExam {

	public static void main(String[] args) {
		//생성자는 반드시 1개 이상 존재해야만 한다. 
		//개발자가 만들지 않으면 자동으로 default constructor를 자동으로 자바가 만들어준다.
           //Car c1 = new Car();//기본 생성자는 더이상 만들어지지 않는다. 
           //클라스와의 관계를 설명할때 인스턴스라고 한다. 
           Car c2 = new Car("Grandeur");
           
           System.out.println(c2.name);
     
            //객체를 호출 결과 = success
	}

}

