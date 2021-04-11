package day0119;
/**
 * 
 * 비교연산자
 * ㄴ 2개의 값을 비교한다.
 * ㄴ >, >=, <, <=, ==, !=
 * ㄴ 결과값이 true/false의 boolean 값으로 나오게 된다.
 * 
 * @author bitcamp
 *
 */
public class Ex06Operator3 {
	public static void main(String[] args) {
		int number = 5;
		System.out.println("number > 3 : " + (number > 3));
		System.out.println("number > 30 : " + (number > 30));
		
		System.out.println("number < 10 : " + (number < 10));
		System.out.println("number < 0 : " + (number < 0));
		
		System.out.println("number < 5 : " + (number < 5));
		System.out.println("number <= 5 : " + (number <= 5));
		
		// == 은 2개의 값이 같은지 비교
		// != 은 2개의 값이 다른지 비교
		
		System.out.println("number == 5 : " + (number == 5));
		System.out.println("number == 3 : " + (number == 3));
		
		System.out.println("number != 5 : " + (number != 5));
		System.out.println("number != 3 : " + (number != 3));
		
		System.out.println("==============================================");
		
		// ==, != 단점
		// ㄴ 참조형 변수에 대해서는 올바르지 않은 결과값을 연산할 수도 있다.
		
		String str = new String("abc");
		String str2 = "abc";
		String str3 = str2;
		
		// str, str2, str3의 값을 출력하기
		System.out.println("str : ["+str+"]");
		System.out.println("str2 : ["+str2+"]");
		System.out.println("str3 : ["+str3+"]");
		
		// == 으로 비교하는 경우
		System.out.println("str == str2 : " + (str == str2));
		System.out.println("str == str3 : " + (str == str3));
		System.out.println("str2 == str3 : " + (str2 == str3));
		
		// 비교연산자의 경우 참조형 변수의 실체 값이 아닌 주소값을 비교하기 때문에 정확한 결과를 받아볼 수 없다.
		// ㄴ 클래스형 변수의 경우 해당 변수의 equals()메소드를 호출하여 비교해야한다.
		System.out.println("str.equals(str2) : " + str.equals(str2));
		System.out.println("str.equals(str3) : " + str.equals(str3));
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		
	}

}
