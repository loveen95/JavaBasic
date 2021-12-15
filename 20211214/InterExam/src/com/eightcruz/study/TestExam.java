package com.eightcruz.study;

import javaStudy.AccessObj;

public class TestExam {

public static void main(String[] args) {
		
		AccessObj obj = new AccessObj();
		
		System.out.println(obj.p);
		System.out.println(obj.p2); 
		System.out.println(obj.k);
		System.out.println(obj.i);//결과 = 실행이 안됨.자기 자신만 쓸수 있다. 

	}

}
