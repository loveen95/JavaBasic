
/* MAP 맵 - 파이썬의 딕셔너리와 같은 자료 구조, JS 에선 json 데이터를 키값과 벨류값의 쌍으로 저장하는 구조 순서가 없어 키 값으로만 벨류 값을 얻는다. 가장 큰 특징은 순서에 의존하지 않는것!
key   value */

// HashMap<String, String> map = new HashMap<String, String>();
// );// 키값으로 value값 
// System.out.println(map.get("people"));//map의 갯수 확인
//  System.out.println(map.size());
//  //map삭제
//    System.out.println(map.remove("people"));
//    //키 값의 존재 유무 확인
// containsKey()     System.out.println(map.get("people"));


//조건문에는 if 와 while문이 있다.

// /* if 조건문!!!!*/
// • 조건식이 true일 경우에만 실행문을 실행한다.

// • if(조건식) 다음의 {}를 생략할 수 있다. 하지만 생략할 경우 if 문에 포함되는 실행문은 단 한 줄만 포함된다.

// // *불러와야 할 경우 
// // import java.util.ArrayList; <- 이 형식을 쓴다.*

// // 1. 경우의 수가 여러개 일때 if 안에 if 형태로 구성 but 많이 쓰이진 않음
// import java.util.ArrayList;
// class Main {
//       public static void main(String[] args) {
//         ArrayList<String> coffee = new ArrayList<String>();

//         coffee.add("sugar");
//         coffee.add("syrub");
      
//            if (coffee.contains("decaf")) {
//           System.out.println("안먹는다");
//            }else if (coffee.contains("sugar")){
//           System.out.println("먹는다");    
//           } else
//           System.out.println("안먹는다");
//      } 
//     //else if란 첫번째 조건이 불만족이면 두번째 else if 조건이 만족하므로 두번째 결과를 출력합니다. 맞는 조건이 하나도 없을때 else 를 넣으면 결과를 출력할 수 있다.
// }

// class Main {
//       public static void main(String[] args) {
//        int money = 3000;
//        boolean card = true;
       
      
//            if (money>=6000 || card) 
//            {
//           System.out.println("택시탄다");
//            } else {
//              System.out.println("걸어간다");
//            }   
//       }
// }       
// || or는 둘중 하나 만 만족해도 true
// && and 둘다 만족해야만 true

// public class Main {
//    public int IfTest(int value) {
//      int ret= 0;
//      if(value % 3 == 0) {
//        ret = 3;
//      } else if(value % 4 == 0) {
//        ret = 4;
//      }
//     return ret;
//    }
// //변수 value 가 3인지를 검사해 3의 배수엄마가 라면 ret에 3을 저장, 후 else if문을 추가해 value가 4의 배수인지를 검사하고 ,4의 배수라면 ret애 4를 저장
//    public static void main(String[] args) {
//      Main exam = new Main();
//      System.out.println(exam.IfTest(6));
//      System.out.println(exam.IfTest(8));
//      System.out.println(exam.IfTest(12));
//    }
//  }//조건이 두개 이상이라면 if ()문을 사용, 조건에 맞으면 ret에 4를 넣어주고 else if블록 안에 ret구문을 포함

//switch-case 구문 - if문과 비슷하지만 좀 더 절차를 단순화 시키는 조건 판단문이다. 

 //int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
//      String season="";

//      switch (month) {
//        case 12: case 1: case 2: 
//              season = "겨울";
//              break;
//        case 3: case 4: case 5: 
//              season = "봄";
//              break;
//        case 6: case 7: case 8: 
//              season = "여름";
//              break;
//        case 9: case 10: case 11: 
//              season = "가을";
//              break;    
//      }
//     System.out.println(season);
//      int month = 1;
//      String monthString="";

//      switch (month) {
//        case 1: monthString = "jan";
//              // break;
//        case 2: monthString = "feb";
//              // break;
//        case 3: monthString = "mar";
//              // break;
//        case 4: monthString = "apr";
//               break;
//        case 5: monthString = "may";
//               break;
//        case 6: monthString = "jun";
//               break;
//        case 7: monthString = "jul";
//               break;
//        case 8: monthString = "aug";
//               break;
//        case 9: monthString = "sep";
//               break;
//        case 10: monthString = "oct";
//               break;
//        case 11: monthString = "nov";
//               break;
//        case 12: monthString = "dec";
//               break;              
//      }
//     System.out.println(monthString);
//    }
// }

//while 문 -어떤일을 반복 수행하고 싶을때 사용 do, do while, for  등등이 있다. while 은 조건이 참일경우에 반복 실행합니다.
//public class Main {
//    public static void main(String[] args) {

//      int i = 0;

//      while(i < 10){
//        System.out.println(i+" hi~");
//        i++; //증감 연산자를 사용해 조건을 만족하지 않게 하므로 반복을 멈출것이다.
//      }
//    }
// }
//int i = 0일때

//      while(true){
//        i++; // i = i + 1 // i += 1;
//        System.out.println("나무를 " + i +" 번 찍었습니다. ");
//        if (i == 10) {
//          System.out.println("나무 넘어간다~");
//          break;
//        }
 //i가 하나씩 증감하고 만약 i가 10과 같다면 결과를 출력하고 빠져나간다.
//      }

//int i = 0;

//      while (i < 10) {
//        i++;
//        if (i % 2 == 0){
//          continue;
//        }
//        System.out.println(i);//continue    조건에 맞지 않는 경우 반복문의 처음으로 돌아간다.

//반복문 - do~while
 //   do~while 은 조건이 참일 동안 //반복 실행한다.
 //   무조건 한 번은 반드시 실행된다.  


// import java.util.Scanner;

// public class Main {
//    public static void main(String[] args) {

//      int i = 0;
//      Scanner scan = new Scanner(System.in);

//     do {
//         i = scan.nextInt();
//         System.out.println("입력받은값:"+i);
//     }while(i != 0);
//     System.out.println("종료");
  
//    }
// }
//반복문 for
//int sum = 0;
//      for(int i = 1 ; i <= 100; i++) {
//     //start초기문 stop 조건문  step 증강문
//        sum += i;

//        if(i == 50) {
//          break;
//        }


//      }

//   System.out.println(sum);
//public class Main {
   //public static void main(String[] args) {

    //  if (5 > 4){
    //    System.out.println(50);
    //  } else {
    //     System.out.println(40);
    //  }

    // if를 사용하지 않고 조건문 -> 삼항연산자
    //System.out.println((5>4) ? 50 : 40);
  // }
//}

