package ExceptionExam;

public class ExceptionExam { 

	public static void main(String[] args) {
		//method()과 main메서드 양쪽의 catch블럭이 모두 실행되었다.
		//method1()에서 예외처리를 하고도 throw문을 통해 다시 예외를 발생시켰다. 
		//새로 생성된 예외를 main으로 던져서 throws 한번더 처리된다. 
		
		try {
			method1(); 
	 	} catch(Exception e) {
	 		System.out.println("Main에서 예외처리");
	 	}
	}
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("Method1에서 예외처리");
			throw e;// 예외처리 완료
		}
	}
		
		
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//			System.out.println("에러");
//		} finally { //닫아줘야 하기 때문에 많이 사용된다. 
//			System.out.println("무조건(항상) 실행");
//		}
//		
		
		
		
//		try {
//		method1(); 
//		
//		} catch(Exception e) {
//			System.out.println("main에서 예외를 처리");
//		}
//	}
//		static void method1() throws Exception {				
//			throw new Exception();
			
		}
	
			
			
	
//		method1(); //같은 클래스내에서 static 이면 객체 생성 없이 바로 호출
//	}
//		static void method1() throws Exception{
//			method2();
//		}
//		static void method2() throws Exception{
//			throw new Exception();
//		}
		/*
		 Exception in thread "main" java.lang.Exception
	at ExceptionExam.ExceptionExam.method2(ExceptionExam.java:12)
	at ExceptionExam.ExceptionExam.method1(ExceptionExam.java:9)
	at ExceptionExam.ExceptionExam.main(ExceptionExam.java:6)
	
	*1. 예외가 발생 했을때 3개의 메서드가 실행되었고 
	*2. 예외가 발생한 곳은 method2()이며
	*3. 메인메서드가 method1(),method2(),main 메소드가 호출 했다는 것을 알수 있다. 
	*/
		
		
		
		
		
		
	  //throw new Exception();//에러 발생 들어가지는거 조차 안된다.
//	    System.out.println("예외발생");
//		throw new RuntimeException(); //들어간다음에 예외 처리
		
//		try {
//	  //Exception e = new Exception("예외 강제 발생");//예외도 객체다.
//	  //throw e;
//		throw new Exception("예외 강제 발생");
//		}catch(Exception e) {
//			System.out.println("에러 메시지 : "+ e.getMessage());
//		}
//		System.out.println("프로그램 종료");
		
		
		
		
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3);
//			System.out.println(0/0); //에러 발생 지점
//			System.out.println(4);   
//		} catch (ArithmeticException ae) {
//		  
//		   System.out.println("에러메세지 :" +ae.getMessage());	
//		   //어떤 종류의 에러인지 가져올수 있는 메서드 .getMessage()
//		}
//		
//		System.out.println(6);
//		
		
		
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3);
//			System.out.println(0/0); //에러 발생 지점
//			System.out.println(4);   
//		} catch (ArithmeticException ae) {
//		   if (ae instanceof ArithmeticException ) //에러도 객체
//			   System.out.println("true");
//		   System.out.println("ArithmeticException");					
//		} catch (Exception e) {
//			System.out.println("Exception"); //에러 발생 즉시 catch로 넘어가지만
//			                                 
//		
//		System.out.println(6);
		
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3);
//			System.out.println(4);
//			
//		}catch (Exception e ) {
//			System.out.println(5); //5는 출력 되지 않는다. 예외가 없다.
//		}
//		
//		System.out.println(6);
//		
		
		
		
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3);
//			System.out.println(0/0); // 예외발생 즉시  발생하는 순간 catch 넘어가 
//			                         // 4는 출력되지 않는다.
//			System.out.println(4);   // 실행되지 않는다. 
//			
//		}catch (Exception e ) {
//			System.out.println(5); // 5는 출력 되지 않는다. 예외가 없다.
//		}
//		
//		System.out.println(6);
//		
		//Exception e모든 종류의 에러를 다 받는다.
		
		
		
		
		

//		   int num = 100;
//		   int result = 0;
//		   
//		   for(int i = 0; i < 10; i++) {
//			   try {
//			     result = num / i;
//			     System.out.println(result); 
//		   } catch (ArithmeticException e) {
//			   System.out.println("0으로 나눌수 없습니다.");
//		   }
//	   }
/*
 * 예외 처리(중요!!!!!!!)Exception Handling
 *  프로그램이 실행중 어떤 원인에 의해 오작동하거나 비정상적인 종료가 되는 경우가 있다. 
 *  이러한 결과를 초래하는 원인을 에러 또는 오류라고 한다. --> 예외 처리
 *  
 *     컴파일 에러 : 컴파일시 발생하는 에러 - 프로그램 진입 불가
 *                오타나 잘못된 구문, 잘못된 자료형 등 기본적인 검사를 수행하여 오류를 확인   
 *                 
 *     런타임 에러 : 실행중에 발생하는 에러 - 프로그램 진입 후 동작 중에 발생
 *                컴파일시 에러가 발생하지 않았다고 하더라고 프로그램이 동작 중에 에러가 
 *                발생할수 있다. 프로그램이 실행중 동작을 멈춘 상태로 오랜 시간 지속되거나
 *                갑자기 프로그램이 실행을 멈추고 강제 종료되는 경우 등 
 *                
 *      (논리적 에러 : 실행은 되나 의도와 다르게 동작하는 것)
 *     자바에서는 발생 할 수 있는 오류를 Exception 과 Error클래스로 정의하고 있다.
 *     //객체가 에러가 나는것이다.   
 *     에러 error : 프로그램 코드에 의해 수습될 수 없는 심각한 오류
 *     예외 exception : 프로그램에 의해 수습될 수 있는 다소 미약한 오류
 *     
 * try-catch 구문
 *  에러는 어쩔수 없지만(프로그래머가 수습 불가) 예외는 프로그래머가 그에 대한 처리를 
 *  미리 해주어야 한다.
 *  
 *  예외처리 : 프로그램 실행시 발생 할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성하는것을 말하며
 *          예외처리 목적은 예외이 발생으로 인한 프로그램의 비정상적인 종료를 막고 정상적인 실행상테를 
 *          유지할 수 있도록 하는 것이다.
 *try {
 *       //예외가 발생할 가능성이 있는 문장들을 넣는다. 
 *}catch ( Exception e) {
 *       //예외가 발생시  예외 처리 구문          
 * }finally {
 *       //예외 발생 유무와는 상관없이 항상 실행, 생략 가능
 * }
 * 1.발생한 예외와 일치하는 catch블록이 있는지 확인한다.(catch가 여러개 존재 가능)
 * 2.일치하는 catch블록을 찾게되면 그 블록의 문장을 수행하고 빠져나간다.
 * 
 * 예외가 발생하지 않는 경우는 catch를 거치지 않고 빠져나간다.
 * 
 * 예외 강제 발생 시키기 throw
 * 
 * 메서드의 예외 선언 : 예외를 메서드에 선언하여 처리한다. 
 * 
 * 예외처리 방법
 *  method1() 예외처리 - 예외가 발생한 그 해당 위치에서바로 예외처리 , 
 *                    호출한 main은 에러가 method1()에서 돌다가 에러가 발생했는지 조차 
 *                    알수 없게 된다. 
 *  
 *  main()예외 처리 - 예외 발생 메소드를 호출한 지점에서 예외를 받아서 처리
 *                 예외를 돌려 받게 되면 예외를 인지 할수 있게 된다.
 *                 
 *  finally 블럭 - 예외의 발생 여부와는 상관 없이 어떤 경우에도 실행되는 코드들을 포함 시킨다. 
 *                선택적으로 사용 여부를 결정할 수 있다. 필수는 아니지만 쓴다. 
 *                
 *예외 되던지기 (Exception Re-throwing)
 * 한 메서드에 발생 가능한 예외가 여러개가 있을 경우 몇개는 메서드 내에서 자체적으로 처리하고
 *  나머지는 호출부로 던져서 처리함으로 양쪽에서 나눠서 처리한다.
 *  심지어는 하나의 예외도 양쪽에서 처리 할 수있다. 
 *  예외를 처리하고 나서 그 예외를 다시 호출한곳으로 던져서 양쪽에서 모두 처리하는 방법이다.
 *  
 *예외가 예외를 발생 (changed exception)
 * 예외 A가 예외B를 발생 시킨다면 A를B의 '원인예외(cause exception)'이라고 한다.
 * 
 
 *  
 *                                
 * */

	


