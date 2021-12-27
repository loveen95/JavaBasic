package stringExam;

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
        
      
	}

}
