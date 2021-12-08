/*   작성자 : 이윤빈 
    작성일 : 2021.12.08 */

// -클래스 선언-
//    class MainReaview {
//      //class 명은 반드시 파일명과 동일
//      public static void main(String[] srgs) {
//        System.out.println("Hello World !" );
//      }
//    }
// -연산자 종류-
// System.out.println(a + b); 
// System.out.println(a - b);
// System.out.println(a * b);
// System.out.println(a / b);
// System.out.println(a % b); // 나머지 연산자

// - ++a --a의 차이 - 
//  int a = 0;
//  int b = 10;
//  a++; = 하나 증가/ a = a + 1,  a += 1;
//  b--; = 하나 감소/ b = b - 1,  a -= 1;
//   System.out.println(a);
//   System.out.println(b);

//  ++a; = 하나를 증가하고 출력
//  --b; = 출력을 하고 하나를 증가
//    System.out.println(++a); 
//    System.out.println(--b);

//  -변수명 선언 규칙-
//     숫자로 시작X, _$외 특수문자 사용X, 예약어X ,한글 가급적X          소문자로 o
//     ex) a100(o) 100a(X) , _free(0) @free(X), 

//-문자열에서 많이 사용되는 메서드-
// equals, indexOf, replaceAll, substring, toUpperCase, toLowerCase

//*equals* - 두 개의 문자열이 동일한지 비교하여 결과 리턴
 class Main {
  public static void main(String[] args) {
  String a = "hello";
  String b = "java";
  String c = "hello";

  System.out.println(a.equals(b));
  System.out.println(a.equals(c));
 }
 }


//*indexOf* - 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴

 class Main {
  public static void main(String[] args) {
  String a = "hello world";

  System.out.println(a.indexOf("world"));

 }
 }

//*replaceAll* - 문자열 중 특정 문자열을 다른 문자열로 치환

 class Main {
  public static void main(String[] args) {
  String a = "hello world";

  System.out.println(a.replaceAll("world", "java"));
 }
 }
 //*substring* - 문자열 중 특정 부분을 뽑아낼 경우 사용한다.-


class Main {
 public static void main(String[] args) {
 String a = "Hello World";
 System.out.println(a.substring(0,4));
}
}
 



//  -문자열 예-
//      ex) run, runFast


   
   

