
                  //#3-15
// import java.util.Scanner;
// class Main {
// public static void main(String[] args) {
//   Scanner scan = new Scanner(System.in);
//   int min = 100;
//   System.out.println("정수 a:" );
//   int a = scan.nextInt();
//   if (a < min) {
//     min = a;
//   }
//   System.out.println("정수 b:" );
//   int b = scan.nextInt();
//   if (b < min){
//     min = b;
//   }
//   System.out.println("정수 c:" );
//   int c = scan.nextInt();
//   if (c < min) {
//     min = c;
  
//   }
//   System.out.println("최소값은" + min + "입니다.\n" );
// }
// }


//                 # 3-21
// import java.util.Scanner;
// class Main {
// public static void main(String[] args) {

// int month = 0;
// Scanner scan = new Scanner(System.in);
// System.out.println("지금은 몇월 입니까?:");
// month = scan.nextInt();

// String season = "";

// switch(month) {
// case 12 : case 1 : case 2 :
// season = "겨울";
// break;
// case 3 : case 4 : case 5 :
// season = "봄";
// break;
// case 6 : case 7 : case 8 :
// season = "여름";
// break;
// case 9 : case 10 : case 11:
// season = "가을";
// break;
// case 13 : season = "";
// } 
// System.out.println(season);
 
//  if (month == 13) {
// System.out.println("그런 월은 없습니다.");
//  }
// }
// }
//                #4-2
// import java.util.Scanner;
// class Main {
//  public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    int num = 0;

//      do {
//        num = scan.nextInt();
//        System.out.println("세 자리의 정숫값:" + num);
//      } while (num < 100 || num > 999 );
//        System.out.println(" 입력한 값은" + num + "입니다." );
//   }
//  }

  //              #4-14
// import java.util.Scanner;
// class Main {
// public static void main(String[] args) {
//   Scanner scan = new Scanner(System.in);
//   int n = scan.nextInt();
//   System.out.println("1부터 n까지의 합을 구합니다. n의 값:" + n);
//   int num = 1;
//   int total = n + num;
//   for (int s = 0; s > 1; s++) {
//        n = scan.nextInt();
//   }
//      System.out.println("1부터" +n+ "까지의 합은" + total +"입니다.");
// }
// }

             //#4-21

// class Main {
// public static void main(String[] args) {
//       for(int i= 0;i < 5 ; i++){
//         for (int j = 0; j < 5; j++){
//           System.out.print("*");
//         }
//         System.out.println(); 
//       }
//   }
//  }
             

