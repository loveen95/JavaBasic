package exams;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueExam1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;

	public static void main(String[] args) {
	//history 최근 사용 문서 
		System.out.println("help를 입력하면 도움말을 볼수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					break;
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말");
					System.out.println("q또는 Q- 종 료");
					System.out.println("history - 최근 작업 명령어"+ MAX_SIZE +"개");
										
				}else if(input.equalsIgnoreCase("history")) {
				 int i = 0;
				 save(input); //입력받은 명령어를 저장
				 
				 LinkedList tmp= (LinkedList)q;
				 ListIterator it = tmp.listIterator();
				 
				 while(it.hasNext())
					 System.out.println(++i +"."+it.next());				 
				}else {
					save(input);
					System.out.println(input);
				}
				
			}catch(Exception e) {
				System.out.println("입력오류");
			}
		}
	}
	public static void save(String input) {
		if(!"".equals(input))
			q.offer(input);
		//큐의 최대 크기를 넘으면 제일 먼저 처음 입력된 값을 삭제한다. 
		// FIFO라고 한다.
		if(q.size() > MAX_SIZE)
			q.remove();
		
	}
}
