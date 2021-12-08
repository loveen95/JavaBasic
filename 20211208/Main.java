/* List 리스트
     배열과 비슷한 자료형, 크기가 정해지지 않고 동적으로 변한다. 배열은 그 크기가 생성시 정해지지만 리스트는 그 크기가 정해지지 않아 원하는 만큼 자유롭게 담을수 있다.

     ArrayList (실제로 많이 씀)








*/

// import java.util.ArrayList;
// //남들이 만든걸 가져다 씀

// public class Main {
//   public static void main(String[]srgs) {

//     ArrayList pitches = new ArrayList(); //객체생성=붕어빵을 하나 찍는 개념

//     pitches.add("123"); //0번째지만 밑에 0,133을 넣어서 1번째가 됨
//     pitches.add("234"); 
//     pitches.add("789");
//     pitches.add(0,"133");


//     System.out.println(pitches.get(1));
//     //get()매서드를 이용한 특정 인덱스 값을 추출

//     System.out.println(pitches.size());
//     // size()a메서드를 이용하여 리스트의 갯수를 확인

//     System.out.println(pitches.contains("234"));

//     //contains()매서드를 이용하여 포함 여부 확인
//     System.out.println(pitches.remove("789"));
//     //remove()매서드를 이용하여 해당 객체 값을 삭제하고 결과를 리턴
//     System.out.println(pitches.remove(0));
//     //remove()매서드를 이용하여 해당 인덱스의 객체를 삭제
  
//   }
// }


/*
배열 array -  여러개의 원소를 한번에 담는 자료형
              자료의 집합이다.
              배열은 그 길이가 고정된다. 즉, 한번 생성하면 길이를 수정할수 없다.

int engScoreKim = 80; // 1개만 저장
int[] engScore = {80,90,65,100};
String[] names = {"kim", "park", "son", "lee"} 





*/
//  class Main {
//    public static void main(String[] args) {
//        String[] weeks = new String[7];

//        weeks[0] = "월";
//        weeks[1] = "화";
//        weeks[2] = "수";
//        weeks[3] = "목";
//        weeks[4] = "금";
//        weeks[5] = "토";
//        weeks[6] = "일";

//      //String[]weeks = {"월","화","수","목","금","토","일"};
//      //System.out.println(weeks[3]);

//      //반복문 (for, while, do-while)
//           //정확하게 n회 반복 - for
//           //정확하게 ~까지 n회 반복 - while
//      for (int i = 0; i < weeks.length; i++) {
//        System.out.println(weeks[i]);
//       }    

//       System.out.println(weeks[7]);
//        //ArrayIndexOutOfBoundsException "예외" - 인덱스가 없는 위치를 지정 
           
//     }
//  }



 // char 문자 (한 글자)

// class Main {
// public static void main(String[] args) {
// char a = 'a'; //한 글자일 때에는 작은따옴표
// char b = 97; // ascII 코드 97 = a 자동환원됨
// char c = 0x7A;

// System.out.println(a);
// System.out.println(b);
// System.out.println(c);
// }
// }






/*
Bool (불 Boolean) true 1 (0이 아닌 모든것), false 0



*/

// class Main {
// public static void main(String[] args) {

// int base = 100;
// int height = 185;
// boolean isTall = height > base;
// if (isTall) {
// System.out.println("키가 큽니다");
// }
// }
// }







/*
String 문자열, 글자들
"Hello world"
"a"
"12345"

String a = new String("Hello World")
//원래는 위와 같은 표현을 사용하여 객체를 생성한 후 사용하는게 원칙이나,

String a = "Hello World";
// String은 자바에서 특별 취급을 하여 간단하게 사용할수 있다.



//문자열에서 많이 사용되는 메서드.

// equals (***) 두 개의 문자열이 동일한지 비교하여 결과 리턴

}
*/

// class Main {
// public static void main(String[] args) {
// String a = "hello";
// String b = "java";
// String c = "hello";

// System.out.println(a.equals(b));
// System.out.println(a.equals(c));
// }
// }

// indexOf 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴

// class Main {
// public static void main(String[] args) {
// String a = "hello world";

// System.out.println(a.indexOf("world"));

// }
// }
// 0에서 시작, 빈칸도 글자, 이하보다는 미만 표현
// 서울시 강남구, 서울시 서초구, 서울시 송파구

//replaceAll 문자열 중 특정 문자열을 다른 문자열로 치환

// class Main {
// public static void main(String[] args) {
// String a = "hello world";

// System.out.println(a.replaceAll("world", "java"));
// }
// }
// substring 문자열 중 특정 부분을 뽑아낼 경우 사용한다.


// class Main {
// public static void main(String[] args) {
// String a = "Hello World";
// System.out.println(a.substring(0,4));
// }
// }
// 끝 위치는 포함하지 않는다. 즉 ~미만이다. 4 미만.









// class Main {
// public static void main(String[] args) {
// String a = "Hello World";
// System.out.println(a.toUpperCase());
// }
// }

// class Main {
// public static void main(String[] args) {
// String a = "HELLO WORLD";
// System.out.println(a.toLowerCase());
// }
// }









/*
변수 : 어떤 값을 보관하는 용도

int a; a라는 변수명에 정수를 보관할것이다.
String b; b라는 변수명에 문자열을 보관할것이다.

변수명 선언 규칙
1. 변수명은 숫자로는 시작할수 없다. a100(가능) 100a(불가능)
2. _ underscore와 $ 는 사용 가능하지만, @, !는 사용 불가능
3. 예약어는 변수명으로 사용할 수 없다. (int, class... 불가능)
4. 한글은 사용하지 않는다. 가급적 소문자로 만든다.

잘못된 변수명 선언 예시
int 2nd; 숫자로 시작 불가능
String b#; 특수문자 사용 불가능
int main; 예약어 사용 불가능

자료형 선언(type)

int a; // 변수명 a는 int 자료형 변수이므로 a라는 변수에는 정수만 담을 수 있다. 1, 2, 10,100.,,,,

String b; // 변수명 b는 String 자료형 변수이므로 b라는 변수에는 문자열만 담을 수 있다."boy", "Hello World"...


클래스 - 자바는 클래스 단위로 프로그램을 구성한다.
클래스명은 명사로 만든다.
여러개의 단어로 만들 경우 각 단어의 첫 문자는 대문자로 구성한다.
예) class Raster {}
class ImageSprite {}

메서드 - 하나의 클래스 안에는 메서드가 여러개 존재할 수 있다. 메소드명은 주로 동사로 만든다.
여러개의 단어로 만들 경우 처음 시작하는 문자는 소문자로 시작하고 두번째 단어부터는 대문자를 사용한다.
예) run{}
runFast{}
getBackground {}

* 권장사항 : 변수명은 짧지만 의미가 있게 만든다.
(변수명을 통해 사용 의도를 알 수 있다.)

# 숫자 자료형(number, integer)
정수 1 10 50..., 실수 3.14, 7.8...

정수
int(***) int age = 21;

long long countStar = 2384735025093L; 끝에 대문자 L 붙는다

실수 (float, double(***))
float float pi = 3.14F;
double(***) double morePi = 3.141592;

*/

// class Main {
// public static void main(String[] args) {

// int i = 0;

// System.out.println(++i); // 하나를 증가하고 출력
// System.out.println(i++); // 출력을 하고 하나를 증가
// System.out.println(i); //
// System.out.println(i++);
// System.out.println(i);




/*
// int i = 0;
// int j = 10;

// i++; // 하나 증가 //i = i + 1 // i += 1;
// j--; // 하나 감소// j = j - 1 // i -= 1;

// System.out.println(i);
// System.out.println(j);

// ++i;
// --j;





// int a = 10;
// int b = 5;

// System.out.println(a+b);
// System.out.println(a-b);
// System.out.println(a*b);
// System.out.println(a/b);

// //나머지 연산자(홀수, 짝수, 배수)
// System.out.println(a%b);
// System.out.println(7%2); //홀수
// System.out.println(6%2); //짝수 0
// System.out.println(6%3); // 배수 나눈수의 배수 0
}



} */








/*
//클래스 블록 : 소스 코드의 가장 바깥쪽 블록
class Main {
//클래스명은 파일명과 반드시 동일해야 한다.

//매서드 블록 (기능을 정의)
//main 메서드가 프로그램 전체의 시작점이다.
public static void main(String[] args) {
// public 접근제어자. public은 모두 접근가능
// static 객체를 생성하지 않고도 사용가능
// void 리턴값이 없음을 의미함
// [] 배열 의미 String은 문자열 args 변수들
System.out.println("Hello World !");
//명령문은 반드시 세미콜론(;)으로 구문의 끝을 나타낸다.
}
}
/*










// 주석 comment : 코드에 대한 설명을 적는다.
// 주석은 컴퓨터는 읽지 않는다.
// 코드의 실행을 잠시 멈추고 문제점을 파악하는 용도로도 사용


//보통 코드 위에 적는다.
//클래스 선언 (라인 주석)
// class Main {
// public static void main(String[] args) {
// System.out.println("Hello world!"); //Hello world를 출력한다
// }
// }

/* 블럭 주석
작성자 : 이윤빈
작성일 : 2021.12.08
*/