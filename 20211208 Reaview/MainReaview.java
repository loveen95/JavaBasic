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
 
//*toUpperCase* - 모든 문자열을 대문자로 변환

 class Main {
   public static void main (String[]args) {
     String a = "Hello World";
     System.out.println(a.toUpperCase());
   }
 }
 
//*Boolean - true 1, false 0

class Main {
  public static void main (String[] args){
    int base = 300;
    int height = 400;
    boolean isHeavy = height > base;

    if (isHeavy) {
      System.out.println("더 무겁습니다.");
    }
  }
}

class Main {
  public static void main(String[]args){
    String[] weeks = new String[3];

    weeks[0] = "리";
    weeks[1] = "스";
    weeks[2] = "트";

  String[] weeks = {"리","스" "트"};
   System.out.println(weeks[3]);

  }
}


import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {

     ArrayList pitches = new ArrayList();

     pitches.add("123");
     pitches.add("234");
     pitches.add("789");
     pitches.get(1));
     // get()메서드를 이용하여 특정 인덱스 값을 추출

     System.out.println(pitches.size());
     // size()메서드를 이용하여 리스트의 개수를 확인
     System.out.println(pitches.contains("234"));
     //contains() 메서드를 이용하여 포함 여부 확인
     System.out.println(pitches.remove("789"));
    //remove()매서드를 이용하여 해당 객체 삭제 하고 결과를 리턴 
      System.out.println(pitches.remove(0));
     //remove()매서드를 이용하여 해당 인덱스의 객체를 삭제
 }
 }

 //ArrayList pitches = new //ArrayList();

//pitches 라는 ArrayList에 담을 수 있는 자료형은 String 뿐이다. 

 //ArrayList<String> pitches = //new ArrayList<String>();


import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    //ArrayList aList = new ArrayList();
    ArrayList<String> aList = new ArrayList<String>();

    aList.add("hello");
    aList.add("java");

    // String hello = (String)aList.get(0);
    // String java = (String)aList.get(1);
    //Casting 강제 형변환

    String hello = aList.get(0);
    String java = aList.get(1);
    // 제네릭스를 사용하여 자료형을 선언하면 그 이후로는
    // 자료형에대한 형변환 casting이 필요 없다. 
    //이미 자바가 aList에는 반드시 String자료형만 추가
    //된다는 것을 알고 있다. 제네릭스를 사용하면 형변환에
    //대한 불필요한 코딩과 잘못된 형변환등의 예외를 방지할 수 있다. 

    System.out.println(hello);
    System.out.println(java);

  }
}




   
   

