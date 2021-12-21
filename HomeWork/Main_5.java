import java.util.*;
class Main {
  public static void main(String[] args) {
                   //#4-30
//     System.out.println("숫자 맞추기 게임 시작! \n 0부터 99사이의 숫자를 맞추세요>>>");
//     Scanner sc = new Scanner(System.in);
//     Random ran = new Random();
  
     
//      int count = 0;
//     int a = ran.nextInt(99);
//     int j= 7;
//         for(int i = 0 ; i < 99; i++){
          
          
//           System.out.println("남은 횟수" + j-- + "회,어떤 숫자일까?" );
//           int num = sc.nextInt();{
//             if(num < a){
//               System.out.println("더 큰 숫자입니다.");
//                 count++;
//             }else if(num > a){
//               System.out.println("더 작은 숫자입니다.");
//               count++;
//             }else {
//               System.out.println( count+"회만에 맞췄습니다.");
//               break;
//             }
//           } 
          
            
//             System.out.println("정답은" + a +"입니다");
//   }
//
//

               //#6-1
// double[] db = new double[5];

//  for(int i = 0; i < 5; i++) 
 
//               System.out.println("a["+i+"] ="+db[i]);
        
          

//   }
// }

                //#6-2
//  int[] num = new int[5];
 
//  for(int i = 0; i < num.length; i++) {
//     num[i] = 5 - i;
 
//               System.out.println("a["+i+"] ="+num[i]);
//         }

//   }
// }
             //#6-3
  // double[] num = new double[5];
 
  // for(int i = 0; i < num.length; i++) {
  //    num[i] = (i+1) * 1.1;
  //              System.out.println("a["+i+"] ="+num[i]);

  // }

             //#6-6
             Scanner sc = new Scanner(System.in);

     int num = 0;
   
     System.out.print("요소수 : ");
    num = sc.nextInt();
    int[] a = new int[num];
     for(int i = 0; i < num; i++ ){
        System.out.print("a["+i+"] =");
        a[i] = sc.nextInt(); 
     }
     for(int i = 0; i < a.length; i++){
         
         System.out.print("a ="+a[i]+",");
           
     }
     }
    
  }
