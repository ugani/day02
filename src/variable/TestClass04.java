package variable;

public class TestClass04 {
	public static void main(String[] args) {
		/*
		 형변환 (type casting)
		 -자료형을 변경하는 것
		 자동 형변환
		 -자동으로 자료형의 형태를 변화하는 것
		 강제 형변환
		 - 강제로 자료형을 변화시키는 것
		 */
		
		char ch = 'A';
		System.out.println( ch );
		
		int num = ch; //자동형변환
		System.out.println(num);
		//ch에 저장되어있는 A를 자동형변환해서 65로 출력
		
		char ch02 = (char)num; //강제형변환
		System.out.println( ch02 );
		//해당하는 자료형 num 앞에 char을 붙여서 강제로 정수를 문자형으로 변환
		//인트는 4바이트, 캐릭터는 2바이트로 작은값을 큰값으로 변환가능

		double d =1.11;
		float f = (float)1.11;
		float f1 = 1.11f;
	}
	
}
