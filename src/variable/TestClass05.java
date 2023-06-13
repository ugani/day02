package variable;

public class TestClass05 {
	public static void main(String[] args) {
		/*
		 상수
		 -final 키워드를 이용하여 단 한번만 초기화 하여 사용하는 변수 (상수화)
		 -값의 변경이 불가능하다.
		 -데이터가 변조되지 않았다는 것을 보장받는 변수 literal 상수
		 -메모리 공간을 일시적으로만 사용하여 한번 사용되고 버려지는 값
		 */
		System.out.println("값:" +100); //literal상수
		String Korea = "대한민국"; //문자열은 "(큰 따옴표)
		System.out.println("나의 나라:" +Korea);
		System.out.println();
		
//		Korea = "미국"; //값을 초기화해서 한번만 사용함
		System.out.println("나의 나라는 : " +Korea);
		System.out.println();
		
		String name = "김말이";
		int age = 20, iQ = 120;
		double h = 173.3;
		char ch = 'B';
		
		System.out.println("이름\t: "+name);
		System.out.println("나이\t: "+age);
		System.out.println("키\t: "+h);
		System.out.println("아이큐\t: "+iQ);
		System.out.println("등급\t: "+ch);
		System.out.println();
		System.out.println("이름\t:" +name + "\n나이\t:" +age+ "\n키\t:"+h+ 
				"\n아이큐\t:"+iQ+"\n등급\t:"+ch);
		
	}
	
}
