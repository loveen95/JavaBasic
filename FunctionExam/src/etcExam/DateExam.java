package etcExam;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.time.*;
public class DateExam {
	
	/*Calendar 추상 클래스 이기때문에 객체를 생성 할 수 없고 메서드를 통해서만 사용한다. 
    Calender cal = new Calendar() //에러
    Calendar cal = calendar.getInstance();
    
    
*/
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		System.out.println("올해의 연도는 : " + today.get(Calendar.YEAR));
		System.out.println("현재의 월은 : " + today.get(Calendar.MONTH));
		//MONTH는 0에서 시작한다. 
		
	
         //System.out.println("올해중 몇번째 주 :" + today.get(Calendar.WEEK_OF_YEAR));
         System.out.println("이달중 몇번째 주 :" + today.get(Calendar.WEEK_OF_MONTH));
         
         System.out.println("이달은 몇 일 :" + today.get(Calendar.DATE));
         System.out.println("이달의 몇 일 :" +today.get(Calendar.DAY_OF_MONTH));
         System.out.println("올해의 몇일 :" + today.get(Calendar.DAY_OF_YEAR));
         
         System.out.println("요일 :" +today.get(Calendar.DAY_OF_WEEK));//일요일이 1
         
         
        
         String[] yi = {"","일","월","화","수","목","금","토"};
         System.out.println("요일" +yi[today.get(Calendar.DAY_OF_WEEK)]+"요일"); 
         
         
         Calendar date1 = Calendar.getInstance();
         Calendar date2 = Calendar.getInstance();
         //Calendar today = Calendar.getInstance();
         
         date1.set(2000,1,1);
         
         
         //System.out.println("date1" + toString(date1));     
         //System.out.println("date2" + toString(date2));
            
         long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
        System.out.println("date1부터 date2까지" + diff + "초 지났습니다.");
        
        System.out.println("date1부터 date2까지" + diff/60/60/24 + "일 지났습니다.");
        
        ////////////////////////////구버전//////////////////////////////////////////
           
        
       
        LocalDate now = LocalDate.now();
        
        System.out.println(now);
        
        LocalDate pari = LocalDate.now(ZoneId.of("Europe/Paris"));
        
        System.out.println(pari);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");
        String formatedNow = now.format(formatter);
        System.out.println(formatedNow);
        
        int year = now.getYear();
        System.out.println("현재의 연도는" +year + "입니다.");
        
        String mon = now.getMonth().toString(); //
        System.out.println("현재의 월" + mon + "입니다.");
        
        int MonVal = now.getMonthValue();
        System.out.println("현재의 월은 " + MonVal + "입니다.");
        
        String dofw = now.getDayOfWeek().toString();
        System.out.println("오늘은" +dofw + "입니다.");
        
        int dofwVal= now.getDayOfWeek().getValue();
        System.out.println("오늘은" +dofwVal + "입니다.");
         
         
         
   
		
		

	}

}
