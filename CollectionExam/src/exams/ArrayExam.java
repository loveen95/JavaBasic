package exams;
import java.util.*;
public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ArrayList
 * 가장 많이 보편적으로 사용되는 클래스이다. 데이터의 저장 순서가 유지되고 중복을 허용한다.
 * 기존의 Vector을 개선한 것으로 구현원리와 기능적인 측면에서 동일하다. 
 * Vector 보다는 ArrayList를 사용하자. 생성한 후에도 수정이 가능하다.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
		ArrayList list1 = new ArrayList(10); 
		list1.add(new Integer(5)); //에러는 아니다
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list1.containsAll(list2));
		print(list1,list2);
		list2.add("B");
		list2.add("C");
		list2.add("A");
		
		System.out.println(list1.containsAll(list2));
		
		print(list1,list2);
		
		
		
		//list2에서 list1에 있는 객체들을 삭제
		for(int i = list2.size()-1; i >=0; i--) {
			if(list1.contains(list2.get(i)))
			  list2.remove(i);
		}
		print(list1,list2);
		
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
		
	}

}
