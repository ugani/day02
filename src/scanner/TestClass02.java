package scanner;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 초기화 방법
		 -자료형의 첫 문자가 소문자면 0으로 초기화한다.
		 -자료형의 첫 문자가 대문자면 null으로 초기화한다.
		 */
//		int num = 0;	// 자료형 첫문자가 소문자면 0으로 하면됨
//		char ch = 0;	
//		double dou = 0;
//		float fl = 0;
//		
//		String name = null; //문자열은 초기화를 할 때 null로 해줘야함
////		Scanner sc = null; //// 자료형 첫문자가 대문자면 null으로 하면됨
//		
//		System.out.println(name);
//		System.out.println(num);
//		
//		int kor=50, eng=96, sum; //초기화가 진행되지 않으면 에러가 발생함,초기화 확인
//		sum = kor + eng;	
//		System.out.println("kor + eng = "+sum);	
		
		 //스캐너 실습
		
		String name;
		int ko, en, ma;
		
		System.out.print("당신의 이름은 무엇입니까?");
		name = sc.next(); 
		
		System.out.print(name+"님의 국어 점수:");
		ko = sc.nextInt();
		System.out.print(name+"님의 영어 점수:");
		en = sc.nextInt();
		System.out.print(name+"님의 수학 점수:");
		ma = sc.nextInt();
		
		System.out.println();
		
		int num = ko+en+ma;
		
		System.out.println("============================");
		System.out.println("이름 :" +name);
		System.out.println("============================");
		System.out.println("국어 :" +ko);
		System.out.println("영어 :" +en);
		System.out.println("수학 :" +ma);
		System.out.println("============================");
		System.out.println("합계 :" +num);
		System.out.println("============================");
		
	}
}
