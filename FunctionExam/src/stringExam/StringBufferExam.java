package stringExam;

public class StringBufferExam {

	public static void main(String[] args) {
/*String 은 immutable 즉  변경 불가능하다. StringBuffer은 변경이 가능하다. 
 * StringBuffer은 String 유사한 점이 많다. 객체를 생성할때 적절한 길이의 char 형배열이 생서되고
 * 이 배열은  문자열을 저장하고 편집하기 위한 공간으로 사용된다.
 * 
 * StringBuffer sb= new StringBuffer("abc");
 * sb.append("123); 
 * ->abc123 
 * 
 * sb에 새로운 문자열이 추가되고 sb자신의 주소를 반환하여 다시 생성하는 개념이다. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
//		 StringBuffer sb= new StringBuffer("abc");
//		 System.out.println(sb);
//		 sb.append("123");
//		 System.out.println(sb); 
//		 StringBuffer sb2 = sb.append("zz");
//		 System.out.println(sb2); //결과 abc123zz
//		 System.out.println(sb); //결과 abc123zz
//		 
//		 
//		 StringBuffer sb3= new StringBuffer("abc");
//		 System.out.println(sb3);
//         sb3.append("123").append("zz");
//         System.out.println(sb3);
//         
//         
//         
//         StringBuffer sbr = new StringBuffer("abc");
//         StringBuffer sbr2 = new StringBuffer("abc");
//         
//         System.out.println(sbr == sbr2); //false
//         System.out.println(sbr.equals(sbr2)); //false
         
        //String에서는 equals르 오버라이딩 해서 문자열을 내용만 비교하도록 구현 되어 있다.
        //StringBuffer에서는 equals가 오버라이딩 하지 않아서 == (주소비교 false)와 같은 결과 출력
        
         String str1 = new String("abc");
         String str2 = str1.toString();
         
         System.out.println(str1.equals(str2)); //결과 true
        //toString()은 오버라이드 되어 있어서 StringBuffer에 toString()을 호출하면
        //담고 있는 문자열을 String 으로 반환한다. 
         
         StringBuffer str3 = new StringBuffer("abc");
         
         String str4 = str3.toString();
         System.out.println(str3.equals(str4));
         
         
         
        
         
		 
		

	}

}
