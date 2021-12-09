// public class Main {
//   public static void main (String[]aggs){

   

//     for (int i = 1;  i <=100; i++ ) {
//       if (i % 2==0) {
//       System.out.println(i);
//     }
//   }
//   }
// }




// public class Main{
//    public static void main(String[]args) { 
     
//      // if를 사용하지 않고 조건문 - > 삼항 연산자 

//      System.out.println((5>4) ? 50 : 40) ;

//         }
// }

/* 반복문 - do while - 
    조건이 참일 동안 반복이라는 것은 똑같으나 무조건 한번 쯤은 반드시 실행 된다.  
*/

//1부터 100까지의 수중 홀수들의 누적 합계를 구하세요.

// public class Main {

//   public static void main(String[] args) {

//     int sum = 0;
//     for(int i = 1 ; i <= 100; i++) {
// // start초기문 stop 조건문 step 증강문  
//       if ( i % 2 == 0){
//             continue;
//       }
//         sum += i;
     
//     }
     
//  System.out.println(sum);

//   }
// }

// public class Main{
//     public static void main(String[] args) {
       
//         int sum = 0;
        
//         for(int i = 1 ; i <=100; i++) {

//           sum = sum + i;
          
//           i++;

//         }
//         System.out.println(sum);
    
//     }
// }
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args){
//     int i = 0;
//     Scanner scan = new Scanner(System.in);
//     do {
//           i = scan.nextInt();
//           System.out.println("입력받은값 :" + i);
//      } while ( i !=0);
//      System.out.println("종료");

    
//     }
        
//    }
     
    


/* 반복문 - while
while 은 조건이 참일 동안 계속 반복 실행한다. 거짓이면 끝
*/
// public class Main {
//   public static void main(String[] args){
//     int i = 0;

//     while( i < 10){
//       System.out.println(i+"hi~");
//       i++; 
//     }
//   }
// }



//continue 조건에 맞지 않는 경우 실행하지 않고 다시 반복문을 처음으로 돌아가도록 하는 방법
// public class Main {
//   public static void main(String[] args){
//     int total = 0;
//     int i = 1;

    

//     while( i <= 100){
//       total = total + i ;
//       System.out.println("i =" + i + "total =" + total);
//       i++; // i = 1 + 1 , i +=   
      
        
//       }
     
//     }



  





//반복문을 실행하다가 break를 만나면 구문을 빠져나간다.

// }public class Main {
//   public static void main(String[] args){
//     int coffee = 10;
//     int money = 300;

//     while( money > 0){
//        // i = 1 + 1 , i += 1;
//       System.out.println("커피를 드립니다."); coffee--;
//       System.out.println("남은 커피는 " + coffee +"입니다.");
      
//       if (coffee == 0) {
//         System.out.println("커피가 다 떨어졌습니다.");
//         break; //while은 탈출 지점이 필요하다.
//       }
    
//   }


// public class Main {
//   public static void main(String[] args){
//     int i = 0;

//     while( i < 10){
//       i++; // i = 1 + 1 , i += 1;
//       System.out.println("나무를"+ i + "번 찍었습니다.");
      
//       if (i == 10) {
//         System.out.println("나무 넘어간다~");
//         break; //while은 탈출 지점이 필요하다.
//       }
    
//   }
// }



//  import java.util.Month;
//  public class Main {
//   public static void main(String[]srgs){
//      int Month = "";

//      if (month <= 2){
//      System.out.println("겨울");
//      }
//     else if (month <= 5)
//     System.out.println("봄");
//   }
    
//     else if (month <= 8)
//     System.out.println("여름");
//  }
//     else if (month <= 11)
//     System.out.println("가을");
//     }

  
//  }
//   }


// import java.util.Calendar;

// public class Main {
//   public static void main(String[] args) {
//     int month = Calendar.getInstance().get(Calendar.MONTH)+1;
//     String season = "";

//     switch (month) {
//     case 12 : case 1 case 2
//             season = "겨울"; 
//             break;

//     case 3 : seoson = "봄";  
//   case 4 : seoson = "봄";
//     case 5 : seoson = "봄";
//     break;
//     case 6 : case 7 : case 8 : 
//              seoson = "가을";
//              break;
    
//      case 9 : seoson = "겨울";
//     break;
//     case 10: seoson = "겨울";
//     break;
//     case 11: seoson = "겨울";
//     break;
       
//     } 
//     }
// }
/* switch-case 구문 - if문과 비슷하지만 좀 더 절차를 단순화 시키는 조건 판단문이다.
*/
// public class Main {
//   public static void main(String[] args) {

//     int month = 9;
    
//     if (month == 1 ) {
//       System.out.println("jan");
//     }
//     else if (month == 2 ) {
//       System.out.println("feb");
//     }
//     else if (month == 3 ) {
//     System.out.println("mar");
//     }
//     else if (month == 4 ) {
//        System.out.println("apr");
//     }
//     else if (month == 5 ) {
//        System.out.println("may");
//     }
//     else if (month == 6 ) {
//       System.out.println("jun");
//     }
//     else if (month == 7 ) {
//        System.out.println("jul");
//     }
//     else if (month == 8 ) {
//        System.out.println("aus");
//     }
//     else if (month == 9 ) {
//        System.out.println("sep");
//     }
//     else if (month == 10 ) {
//        System.out.println("oct");
//     }      
//      else if (month == 11 ) {
//        System.out.println("nov");
//     } 
//      else if (month == 12 ) {
//        System.out.println("dec");
//     } 
     
//     }
    

//   }





// public class Main{
//     public int IfTest(int value) {
//         // 변수 value가 선언됐다고 가정하고 코드를 작성하세요.
//         int ret=0;  
//         if( value % 3 ==0 ) {
//             ret = 3;
//         }
//         else if (value % 4 == 0){ ret = 4;
//         }
//         return ret; // 결과 체크를 위한 코드입니다.
//     }
//     // 아래는 실행을 위한 코드입니다. 수정하지 마세요.
//     public static void main(String[]args) {
//        Main exam = new Main();
//         System.out.println(exam. IfTest(6));
//         System.out.println(exam. IfTest(8));
//         System.out.println(exam. IfTest(12));
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         int x = 50;
//         int y = 60;
                
//         if(x > y) {
//             System.out.println("x는 y보다 큽니다.");
//             System.out.println("test 1");
//         }

//         if(x > y) 
//             System.out.println("x는 y보다 큽니다.");
//             System.out.println("test 2");
//             //{중괄호가 없으면 윗 행만 인삭한다. 따라서 나머지 상관없는test2만 출력된다.}
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         int x = 50;
//         int y = 60;
                
//         if(x == y) {
//           //==는 같습니다.
//             System.out.println("x는 y와 같습니다.");
//         }else {
//             System.out.println("x는 y와 다릅니다.");
//         } 
//     }
// }





/* if */
  // class Main {
  //  public static void main(String[] args) {
      
  //   boolean money = true;

  //    if (money)//true와 false가 온다
  //     {
  //      System.out.println("택시탄다");
  //    } else {
  //      System.out.println("걸어간다");
  //    }
  //  }
  // // }

  //  class Main {
  //   public static void main(String[] args) {
      
  //    int money = 2000;
  //    boolean card = true;

  //     if (money >= 5000 & card)//true와 false가 온다 
  //      {
  //       System.out.println("택시탄다");
  //     } else {
  //       System.out.println("걸어간다");
  //     }
  //     // && and 둘다 만족해야만 true 
  //     // || or 는 둘중하나만 만족해도 true 
  //     // | 는 앞이 true면 뒤를 보지도 않고 true || 는 앞 뒤 둘다 보고 둘중 하나만이라도 true면 true 
  //   }
  //  }



// import java.util.ArrayList;
// class Main {
//      public static void main(String[] args) {
//        ArrayList<String> pocket = new ArrayList<String>();

//        pocket.add("paper");
//        pocket.add("handphone");
//        pocket.add("money");

//        if (pocket.contains("card")) {
//          System.out.println("택시탄다");
//         }else if (pocket.contains("money")) {
//           System.out.println("택시탄다");
//         }else {
//           System.out.println("걸어간다");
//         }
//        }
//      }

      
      
      
       //경우의 수가 여러개 일때 if 안에 if형태로 구성
       //하게되면 가독성이 많이 저하 된다. 쓰지말자.
  
// import java.util.ArrayList;
// class Main {
//      public static void main(String[] args) {
//        ArrayList<String> pocket = new ArrayList<String>();

//        pocket.add("paper");
//        pocket.add("handphone");
//        pocket.add("money");
//           if (pocket.contains("money")) {
//          System.out.println("택시탄다");
//           } else
//          System.out.println("걸어간다");

//      }
// }






/*
MAP 맵 - 파이썬의 딕셔너리와 같은 자료 구조, JS 에선 json 데이터를 키값과 벨류값의 쌍으로 저장하는 구조 순서가 없어 키 값으로만 벨류 값을 얻는다.
key   value
name  이윤빈
age   27

*/
// import java.util.HashMap;
// class Main {
//   public static void main(String[] args) {

//     HashMap<String, String>  map = new HashMap<String, String> ();

//     map.put("people", "사람");
//     map.put("baseball", "야구");
//   //키 값으로 벨류값 가져오기 get()
//     System.out.println(map.get("people"));
//   //키 값의 존재 유무 확인 containskey()
//     System.out.println(map.containsKey("people"));
//   //크기 , map의갯수를 확인 size()
//      System.out.println(map.size());
//   // map의 항목을 삭제
//       System.out.println(map.remove("people"));
//       //map의 가장큰 특징은 순서에 의존하지 않고 
//       //key값으로 value값을 가져오는데 있다.
//       //그렇지만 순서로 데이터를 갖져올 필요가 있으면 
//       //LinkedHashMap TreeMap등을 사용한다.
//         }
// }