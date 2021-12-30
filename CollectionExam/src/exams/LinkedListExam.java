package exams;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		
		
		
		
		/*배열은 가장 기본적인 형태의 자료구조로 그 그조가 간단하고 사용하기 쉽고
		 * 시간도 가장 빠르다는 장점도 가지고 있지만 단점도 있다.
		 * 
		 *  1.크기를 변경할수 없다. 
		 *   -크기를 변경하여면 새로운 배열을 생성해서 데이터를 복사한다.
		 *   -충분히 큰 크기의 배열을 생성해야 하므로 메모리가 낭비된다.
		 *  2.데이터의 추가 또는 삭제에 시간이 많이 걸린다.
		 *   -배열에 데이터를 추가하려면 빈자리를 만들기 위해 데이터들을 복사해서 
		 *    이동해야한다. 시간이 많이 걸림
		 *    
		 * 이러한 배열의 단점을 보안하기 위해 링크드 리스트LinkedList 라는 자료구조가 고안
		 * 배열은 모든 데이터가 연속적으로 존재해야하지만 링크드 리스트는 불연속적으로 존재하는
		 * 데이터를 서로 연결 Linked 한 형태로 구성된다.
		 * 
		 *  array       0 1 2 3 4
		 *  
		 *  linkedlist  0   1   2  3   
		 *              -> ->  ->  ->
		 *              
		 *          링크드 리스트의 각 요소들은 자신과 연결된 다음 요소에 대한 참조(주소값)와 데이터로 구성
		 *          삭제하고자 하는 요소의 이전 요소가 삭제하고자 하는 요소의 다음 요소를 참조하도록 변경하면
		 *          삭제가 이루어진다. 배열처럼 복사하는 과정이 필요없어 처리속도가 매우 빠르다.
		 *          새로운 데이터를 추가할때는 새로운 요소를 생성한 다음 추가하고자 하는 위치의 이전요소의 참조를 
		 *          새로운 요소에 대한 참조로 변경해주고 새로운 요소가 그 다음 요소를 참조하도록 
		 *          변경하기만 하면 되므로 처리속도가 매우 빠르다.   
		 *          
		 *          링크드 리스트는 이동뱡향이 단방향이기때문에 다음 요소에 대한 접근은 쉽지만 이전 요소에 대한 
		 *          접근은 어렵다. 이러한 단점을 보안환 더블링크드리스트(이걸 더 많이씀)도 있다.
		 *                    
		 *  순차적으로 추가 /삭제하는 경우에는 ArrayList가 LinkedList보다 빠르다. 
		 *  중간에 데이터를 추가/삭제하는 경우에는  LinkedList가  ArrayList보다 엄청 빠르다. 
		 *  
		 *  비교를 위해서 데이터의 개수를 크게 잡았고 사실 테이더의 개수가 크지 않다면 어느 것을  사용해도
		 *  큰 차이는 나지 않는다. 그래도ArrayList 와 LinkedList의 장단점을 잘 이해하고 상황에 따라
		 *  적합한 것을 선택해서 사용하자. (결론 = ArrayList를 사용하자ㅋ)
		 *  
		 *               읽기      추가/삭제
		 *  ArrayList   빠르다        느리다      순차적인 작업은 더 빠르다. but 비효율적인 메모리 사용
		 *  Linkedlist  느리다        빠르다      데이터가 많을수록 접근성이 떨어진다.
		 *  
		 *  다루고자 하는 데이터의 개수가 변하지 않는 경우라면 ArrayList가 최상의 선택이되겠지만
		 *  데이터의 개수 변경이 잦다면 LinledList 사용하는 것이 더 나은 선택이 된다. 
		 *  
		 *  두 클래스의 장점을 모두이용해서 조합하여 사용하는 방법도 가능핟. 처음에 작업하기 전에 데이터를
		 *  저장할때는 ArrayList를 사용한 다음, 작업할때는 LinkedList로 데이터를 옮겨서 작업하면 
		 *  더 나은 효율을 얻을수 있다. (결론 = ArrayList를 사용하자ㅋ)
		 *  
		 *  
		 *  		 *  */
		
//		ArrayList al = new ArrayList(2000000);
//		LinkedList ll = new LinkedList();
//		
//		System.out.println("= 순차적으로 추가하기 = ");
//		System.out.println("ArratList :" + add1(al));
//		System.out.println("LinkedList :" + add1(ll));
//		System.out.println();
//		
//		System.out.println("= 중간에 추가하기 = ");
//		System.out.println("ArratList :" + add2(al));
//		System.out.println("LinkedList :" + add2(ll));
//		System.out.println();
//		
//		
//		System.out.println("= 중간에 삭제하기 = ");
//		System.out.println("ArratList :" + remove1(al));
//		System.out.println("LinkedList :" + remove1(ll));
//		System.out.println();
//		
//		System.out.println("= 순차적으로 삭제하기 = ");
//		System.out.println("ArratList :" + remove2(al));
//		System.out.println("LinkedList :" + remove2(ll));
//		System.out.println();
//		
//		
//		
//		
//		
//		
//		
//
//	}
//	public static long add1(List list) {
//		long start = System.currentTimeMillis();
//		
//		 for(int i = 0; i < 1000000; i++) list.add(i+"");
//		 long end = System.currentTimeMillis();
//		 return end - start;
//	}
//	public static long add2(List list) {
//		long start = System.currentTimeMillis();
//		
//		 for(int i = 0; i < 10000; i++) list.add(500,+"X");
//		 long end = System.currentTimeMillis();
//		 return end - start;
//
//}
//	public static long remove1(List list) {
//		long start = System.currentTimeMillis();
//		
//		 for(int i = list.size()-1; i >= 0; i--) list.remove(i);
//		 long end = System.currentTimeMillis();
//		 return end - start;
//
//}	
//	public static long remove2(List list) {
//		long start = System.currentTimeMillis();
//		
//		 for(int i = 0; i < 10000;i++) list.remove(i);
//		 long end = System.currentTimeMillis();
//		 return end - start;
		
		ArrayList al = new ArrayList(1000000);
		LinkedList ll = new LinkedList();
		
		add(al);
		add(ll);
		
	System.out.println("접근시간테스트");
	System.out.println("ArratList :" + access(al));
	System.out.println("LinkedList :" + access(ll));
	
}
	public static void add(List list) {
		for (int i = 0; i < 100000; i++) list.add(i+"");
	}
	public static long access(List list) {
		long start= System.currentTimeMillis();
		for(int i = 0; i < 1000; i++) list.get(i);
		long end = System.currentTimeMillis();
		return end -start;
		
		}
	}
