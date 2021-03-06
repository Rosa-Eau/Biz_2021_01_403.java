package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV3 {
	
	// java에서는 인스턴스 변수를
	// 		private으로 제한한다
	private int intNum1 = 0;
	private int intNum2 = 0;
	private Scanner scan = new Scanner(System.in);
	
	/*
	 * scope()에서는 1개의 숫자를 키보드에서 입력받아
	 * 변수 intNum1에 저장한다
	 * 하지만 여기서 선언된 intNum1은 
	 * 클래스 영역에 선언된 인스턴스 변수와는 
	 * 이름만 같은 완전히 다른 변수다.
	 * 따라서 scope() method가 종료된 이후에는
	 * 변수값에 접근할 수 없다.
	 * scope() method에 선언된 intNum1변수를
	 * 지역변수라고 한다.	 
	 */
	public void scope() {
		System.out.println("숫자를 입력하세요");
		int intNum1 = scan.nextInt();
	}
	
	public void input(){
		System.out.print("intNum1 입력 >> ");
		intNum1 = scan.nextInt();
		System.out.print("intNum2 입력 >> ");
		intNum2 = scan.nextInt();
		System.out.println();
	}
	
	public void algebra() {
		
//		System.out.print(intNum1);
//		System.out.print(" + ");
//		if(3 > 3) {
//			return;
//		}
		
		
		int intAdd = intNum1 + intNum2;
		int intTimes = intNum1 * intNum2;
		int intDiv = intNum1 / intNum2;
		int intSub = intNum1 - intNum2;
		
		/*
		 * print formatting 명령문
		 * "" 안에 문자열을 작성하여 출력문을 만드는 명령문
		 * %d(Decimal) 위치에 정수값을 대신 부착하여 출력문 생성
		 */
		System.out.printf(" %d x %d = %d \n", intNum1, intNum2, intNum1 * intNum2);
		System.out.printf(" %d / %d = %d \n", intNum1, intNum2, intNum1 / intNum2);
		System.out.printf(" %d + %d = %d \n", intNum1, intNum2, intNum1 + intNum2);
		System.out.printf(" %d - %d = %d \n", intNum1, intNum2, intNum1 - intNum2);
		System.out.println();
		
		
		System.out.print(intNum1);
		System.out.print(" + ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intAdd);
		System.out.println();
		
		System.out.print(intNum1);
		System.out.print(" x ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intTimes);
		System.out.println();
		
		System.out.print(intNum1);
		System.out.print(" / ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intDiv);
		System.out.println();
		
		System.out.print(intNum1);
		System.out.print(" - ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intSub);
		System.out.println();
	}
	
	

}
