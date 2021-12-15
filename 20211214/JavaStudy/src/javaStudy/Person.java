package javaStudy;

public class Person {
	String name;
   int age;
   
   public Person(int a) {
	   this.age = a;
   }
   public Person(String n, int a) {
	   this.name = n;
	   this.age = a;//this를 꼭넣어라!!생략도 가능하지만 웹 개발할때에는 넣어야한다.
   }  
}   //객체가 여러개 이기 때문에 this를 붙여서 확실하게 해두기 위해 꼭 써라. 
