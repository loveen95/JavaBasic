package stringExam;
import java.util.StringJoiner;

public class StringExam {

	public static void main(String[] args) {
		/*다른 언어에서는 문자열을 char형의 배열로 다루었으나 자바에서는 문자열 클래스를 
		 * 별도로 제공한다.String 클래스는 문자열을 다루는데 필요한 메서드 들을 함께 제공한다.
		 * 지금까지는 String 의 기본적인 몇가지만 사용헸지만 아주아주 중요하므로 자세히 공부!!
		 * 
		 * 1. immutable 클래스(변경 불가능) 
		 *    한번 생성한 String는 읽어 올수 만 있고 변경할수 없다.
		 *    만약 +연산자를 이용해서 문자열을 결합하는 경우 문자열 자체가 바뀌는게 아니라 
		 *    결합된 새로운 문자열이 생성되는 것이다.
		 *    
		 *     String a= "a";
		 *     String b= "b";
		 *     String c = a+b;     
		 *     연산시 마다 새로운 문자열을 가진 String 객체를 생성되어 메모리 공단을 차지
		 *     가능한 결합 횟수를 줄이는 것이 좋다.
		 *     
		 *     문자열 간의 결합 추룰 등 문자열 작업이 많은 경우는
		 *      String 대신 StringBuffer를 사용하는 것이 좋다.
		 *      
		 *     String 문자열의 비교는 언제나 항상 꼭 a.equal(b)를 사용한다.
		 *     
		 *     빈 문자열
		 *     String s = ""; //참조 변수 s가 참조하고 있는 String 객체는 내부에 
		 *      new char[0] 과 같이 길이가 0인 char형을 배열을 저장하고 있는 것과 같다.
		 *      
		 *      char[] chArr = new char[0]; //길이가 0인 char배열  
		 *   ***char c = ''; char형 변수에는 반드시 하나의 문자르 지정해야만 한다.***!중요!
		 * 
		 * String의 생성자와 메서드
		 * 
		 *  String s = new String("Hello");
		 *  
		 * 
		 * 
		 * */
	
		char[] chArr = new char[0];
		String s = new String(chArr); //String s = new String(");
		
		System.out.println(chArr.length);
		System.out.println("@@@"+ s + "@@@");
		
		String a = new String("Hello"); //주어진 문자열로 객체 생성
		
		char[] b = {'h','e','l','l','o'};
		String c = new String(b);  
        System.out.println(c);
        
        //charAt()은 지정된 위치 index 에 있는 문자를 반환(0부터 시작) //굉장히 많이 씀
        
        String d = "Hello";
        String e = "0123456";
        char f = d.charAt(2);  //인덱스
        char g = e.charAt(2);
        System.out.println(f); // 결과 l
        System.out.println(g); // 결과 2
        
        //compareTo() 비교해서 같으면 0 , 이전이면 -1, 이후면 1
        
        int i = "a".compareTo("a"); //0
        int i2 = "a".compareTo("b"); //-1
        int i3 = "b".compareTo("a"); // 1
        
        System.out.println(i+"/"+ i2+"/"+ i3); //결과 0/-1/1
        
        //concat()문자열들을 붙인다. 
        
        String h = "Hello";
        String k = "World";
        String l = h.concat(k);
        
        System.out.println(l);
        
        //contains() 문자열이 포함 되어 있는 지 검사
        
        String z = "abcdefg";
        boolean y = z.contains("bc");
        
        System.out.println(y); //결과 true 
        
        //endsWith지정된 문자열로 끝나는지 검사
        
        String ab = "Hello.txt";
        boolean aa = ab.endsWith("txt");
        
        System.out.println(aa); // 결과 true
        
        String rrr= "Hello";
        
        //startsWith()지정된 문자열로 시작하는 지 검사 
        System.out.println(ab.startsWith("He"));
        		
        
        
        
//		String ab = "Hello.txt";
//		boolean aa = ab.endsWith("txt");
//		
//		System.out.println(aa);
		
		// equalsIgnoreCase()
		String r = "Hello";
		System.out.println(r.equalsIgnoreCase("HELLO"));
		// indexOf() 주어진 문자가 문자열에 존재하는지 확인 없으면 -1
		System.out.println(r.indexOf('o'));
		System.out.println(r.indexOf('a'));
		// lastIndexOf() 지정된 문자가 오른쪽 부터 찾아서 index를 알려준다.
		System.out.println(r.lastIndexOf('1'));
		// length() 문자열의 갯수 길이를 리턴한다.
		System.out.println(r.length());
		// replace() 글자(char)를 바꿔서 보여준다. (문자열은 immutable)
		System.out.println(r.replace('e', 'a'));
		System.out.println(r);
		// replaceAll() 문자열 바꿔서 보여준다. (문자열은 immutable)
		System.out.println(r.replaceAll("ll","rr"));
		// split() 문자열을 지정된 분리자로 나누어 배열로 변환
		String animals = "dog, cat, bear";
		String[] arr = animals.split(", ");
		
		
		for (String each : arr) {
		System.out.print(each + ", ");
		
		System.out.print("[");
		 for(int j = 0; j < arr.length; j++) {
	
			System.out.println(arr[j]+",");		 
			 }
		 System.out.println(arr[arr.length-1] + "]");
		 
		 //substring() 문자열(몇 글자) 잘라내기
		 System.out.println(r.substring(2));
		 System.out.println(r.substring(2,4)); //미만
		 
		 //toLowerCase()전부 소문자로 보여주기
		 //toUpperCase()전부 대문자로 보여주기
		 System.out.println(r.toLowerCase());
		 System.out.println(r.toUpperCase());
		 System.out.println(r); //원 문자열은  바뀌지 않는다 immutable
		 
		 //trim() 문자열 앞 뒤에 있는 불필요한 여백 제거
		 String rr= "     Hello    ";
		 System.out.println(rr.trim());
		 
		 //join()문자열들을 결합한다. split()과 반대 
		 String animals2 ="dog,car,bear";
		 String[]arrs = animals2.split(",");	 
		 System.out.print("[");	 
		 System.out.print(String.join(",", arrs));
		 System.out.print("]");
		 
		 //import java.util.StringJoiner
		 System.out.println();
		 StringJoiner sj = new StringJoiner(",","[","]");
		 for (String ani:arrs)
			 sj.add(ani);
		 System.out.println(sj.toString());
		 
		 //String은 기본형 값으로도 변환  
		 int ii = Integer.parseInt("100");
		 int jj = Integer.valueOf("100");
		 //원래 valueOf는 
		 
		 int iVal = 100;
		 String strVal = String.valueOf(iVal);//int를 String로 변환
		 

		 
		 double dVal = 200.0;
		 String strVal2 = dVal + ""; //숫자를 메소드를 안쓰고 문자열로 바꾸는 또 다른 방법
		 
		 double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		 double sum2 = Integer.valueOf(strVal) +Double.valueOf(strVal2);
		 
		 System.out.println(sum2);
		 System.out.println(sum);
		 
		 //int val = Integer.parseInt("  123  "); //에러 발생 : 숫자에 문자(빈칸) 포함
		 int val = Integer.parseInt("  123  ".trim()); //여백도 문자에 포함이 되어서 여백을 날린다음에 출력
		 System.out.println(val); 
		 
		 //문자열을 숫자로 변환 하는 과정에서 예외가 발생할 확률이 아주 높기 때문에 주의를 기울여야 한다.
		 
		 String fullName = "Hello.java";
		 
		 //확장자를 제외한 이름은 Hello
		 //확장자는 java		 
//		 1. .의 위치 찾기
		 int idx = fullName.indexOf('.');
//		 2. 첫글자부터 .까지 추출 
		 String fName = fullName.substring(0,idx);
//		 3. .다음부터 끝까지 추출
		 String eName = fullName.substring(idx + 1, fullName.length());
		 
		 
		 String[] strArr = fullName.split("\\.");	 
		 System.out.println("확장자를 제외한 이름은" + strArr[0]);
		 System.out.println("확장자는" + strArr[1]);
			
		 System.out.println("확장자를 제외한 이름은" + fullName.substring(0,fullName.indexOf('.')));
		 System.out.println("확장자는" + fullName.substring(1,fullName.indexOf('.')));
		 
			

		 
		 
		 

		
		 
		 
		 
		 
			 
		 }
       
	}
}


