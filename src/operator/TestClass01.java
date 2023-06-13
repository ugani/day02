package operator;

import java.util.Scanner;

public class TestClass01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 연산자
		 +, -, *, /, %
		 / : 정수 / 정수 => 정수(몫)
		  -실수의 결과를 보고자하면 연산값 중 하나라도 실수값이 있어야한다.
		 %(mod) : 정수 % 정수 -> 나머지
		  - % 연산자는 나머지를 구할 때 사용
		  - 짝, 홀 구분 할 때 사용
		  - 어떤 수의 배수를 구할 때 사용
		  - 각 자리별로 구분지을 경우 	 
		 */
		int n1  = 9, n2 = 2;
		System.out.println(n1 / n2);
		// 일반적인 나누기로는 소수점이 생략되고 출력
		System.out.println(n1 / (double)n2);
		// 강제형변환으로 정수를 실수로 바꾸고 나눔
		System.out.println(n1 % n2);
		// %로 나누면 나머지만 나옴
		System.out.println();
		
		/*
		 복합대입 연산자
		 a = 10;
		 
		 a = a + 10; -> a += 10;
		 a = a / 2; => a /= 2;
		 a = a * 2; => a *= 2;
		 */
		
		System.out.println("====복합대입 연산자====");
		n1 = n2 = 5;
		n1 += 1;  //n1(6) = n1(5) +1;
		System.out.println(n1); //6
		n1 -= 1; // n1(5) = n1(6) -1
		System.out.println(n1); //5
		n1 *= n2; //n1(25) = n1(5) * (5)n2;
		System.out.println(n1); //25
		n1 /= n2; //n1(5) = n1(25) / (5)n2;
		System.out.println(n1);//5
		n1 %= n2; // n1(0) = n1(5) % n2;
		System.out.println(n1); //0
		
		System.out.println("====관계 연산자====");
		/*
		 관계 연산자
		 -결과적으로 true(참) 똔는 false(거짓) 표현
		 >, <, >=, <=, ==, !=
		 a=10, b=5
		 a > b => true
		 a <= b => false
		 a == b => false 같지 않다면 false 출력
		 a != b => true 같지 않다면 true 출력, 같다면 false 출력
		 
		 - 2항 연산자
		 a > b > c => 이건 사용 할 수 없음 (딱 2개만 비교 가능)
		 */
		
		n1 = 5;
		n2 = 4;
		System.out.println(n1 > n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
	
		System.out.println("=====논리 연산자====");
		/*
		 논리 연산자
		 -결과적으로 참 또는 거짓 표현
		 -여러개의 식을 묶고자 하는 경우 사용
		 &&(and) : 모든 값이 참인 경우 참, 하나라도 거짓이 있으면 거짓
		 ||(or) : 하나라도 참이면 결과는 참, 모두 거짓인 경우 거짓
		 !(not) : 결과를 반전 시켜준다. !참 => 거짓, !거짓 => 참
		*/
		int n3 = 10;
		n1 = 5; n2 = 7;
		System.out.println(n1>n2 && n1>n3); 
		//					f		f
		System.out.println(n2>n1 && n2>n3);
		//					t		f
		System.out.println(n3>n2 && n3>n1);
		//					t		t
		System.out.println("----or----"); 
		//하나라도 참이면 참,모두 거짓이면 거짓
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("----and----");
		//둘 다 참이여야 참, 하나라도 거짓이면 거짓
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("----not----");
		// 거짓이면 참으로 반전, 참이면 거짓으로 반전
		System.out.println( !false);
		System.out.println( !true);
		
		System.out.println("====증감 연산자====");
		/*
		 증감 연산자
		 -결과적으로 자기 자신을 1증가 또는 감소한다.
		 a = 10;
		 ++a => a = a + 1; //전치 또는 전위
		 --a => a = a - 1;
		 
		 a++ => a = a + 1; //후치 또는 후위
		 a-- => a = a - 1; 
		 */
		
		n1 = 5;
		++n1;
		System.out.println(n1);
		System.out.println();
		n2 = 5;
		n2--;
		System.out.println(n2);
		//결과적으로 1을 증가시키고, 감소시킴
		
		System.out.println("-------------------------");
		n1 = 10;
		n2 = ++n1; //자기자신을 먼저 증가하고 나머지 연산 진행
		System.out.println("n1 : " +n1);
		System.out.println("n2 : " +n2);
		System.out.println("-------------------------");
		n1 = 10;
		n2 = n1++; //모든 연산이 끝나고 제일 마지막에 자기 자신을 증가
		System.out.println("n1 : " +n1);
		System.out.println("n2 : " +n2);
		
		System.out.println("====삼항 연산자(조건연산자)====");
		/*
		 변수 = (조건식) ? 참인경우 :  거짓인 경우;
		 */
		n1 = 10;
		n2 = 20;
		String result = (n1 > n2)?"n1이 n2보다 크다":"n2가 n1보다 크다" ;
		System.out.println(result);
		System.out.println();
		
		//수를 입력받아 홀,짝을 구분하여 출력하시오
		//수를 입력 받아 3의 배수이면 출력하시오
		//두수를 입력 받아 큰 수를 출력하시오
		int num;
		System.out.print("숫자 입력:");
		num = sc.nextInt();
		String num7 = (num % 2 ==0)?"짝수":"홀수";
		System.out.println(num7);
		num7 = (num % 3 ==0)?"3의 배수임":"3의 배수가 아님";
		System.out.println(num + "은(는) "+num7);
		
		int num1, num2;
		System.out.print("num1 수 입력:");
		num1 = sc.nextInt();
		System.out.print("num2 수 입력:");
		num2 = sc.nextInt();
		System.out.println("num1: "+ num1 + " num2: " + num2);
		String num3 = (num1 > num2)?"num1이 num2보다 크다":"num2가 num1보다 크다";
		System.out.println(num3);
		
		
		
		
		
		
	}

}
