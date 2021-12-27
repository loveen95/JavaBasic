package functionsExam;

public class EqualsExam {

	public static void main(String[] args) {	
	/*equals():뭄자열을 비교하여 그 결과를 boolean값으로 알려준다.
	 * 
	 */
		String a ="password";//사용자로 부터 키보드로 입력빋은 비번
		String b = "password"; //회원가입시 디비에 저장된 비번
		if (a.contentEquals(b)) {
			System.out.println("비번이 일치합니다. 로그인 허용");
		}else {
			System.out.println("잘못된 비번 입니다. 다시입력하세요.");
		}
		}
	}


