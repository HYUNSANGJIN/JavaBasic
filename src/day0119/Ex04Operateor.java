package day0119;
/**
 * 
 * 연산자(operator)
 * ㄴ 특정 수학 기호에 프로그래밍 기능을 정의해놓은 것이다.
 * 
 * 5가지 연산자 종류
 * 
 * - 산술 연산자 : 2개의 값에 대한 산술(간단한 산수)를 실행한다.
 *            : 서로 다른 데이터타입을 연산시키면 더 큰 데이터타입이 결과값이 된다.
 *            : byte와 int를 연산시키면 결과값은 int가 된다.
 *            : 실수형 데이터타입과 정수형 데이터타입을 연산시키면 결과값은 실수형 데이터타입이 된다.
 *   ㄴ + : 두개의 값을 더한다
 *   ㄴ - : 앞의 값에서 뒤의 값을 뺀다.
 *   ㄴ * : 2개의 값을 곱한다.
 *   ㄴ / : 앞의 값에서 뒤의 값을 나눈 몫을 구한다.
 *   ㄴ % : 앞의 값에서 뒤의 값을 나눈 나머지를 구한다.
 *   
 * - 할당 연산자 
 * - 비교 연산자
 * - 논리 연산자
 * - 비트 연산자
 * 
 * 
 * 
 * @author bitcamp
 *
 */
public class Ex04Operateor {
	public static void main(String[] args) {
		// 산술연산자
		int number1 = 4;
		int number2 = 7;
		
		System.out.println("number1 + number2 : ");
		System.out.println(number1 + number2);
		
		System.out.println("number1 - number2 : ");
		System.out.println(number1 - number2);
		
		System.out.println("number1 * number2 : ");
		System.out.println(number1 * number2);
		
		System.out.println("number1 / number2 : ");  // 정수형 데이터타입끼리의 나눗셈은 무조건 몫만 구한다.
		System.out.println(number1 / number2);
		
		System.out.println("number1 % number2 : "); // 두 수의 나눗셈의 나머지를 구한다.
		System.out.println(number1 % number2);
		
		System.out.println("=====================================================");
		
		double d = 7.0;
		
		System.out.println("number1 + d : ");
		System.out.println(number1 + d);
		
		System.out.println("number1 - d : ");
		System.out.println(number1 - d);
		
		System.out.println("number1 * d : ");
		System.out.println(number1 * d);
		
		System.out.println("number1 / d : ");
		System.out.println(number1 / d);
		
		System.out.println("number1 % d : ");
		System.out.println(number1 % d);
		
		// String
		// ㄴ 클래스로써 어려개의 문자를 할당가능한 데이터타입이다.
		// ㄴ String값은 ""안에 적힌 글자들이 값이 된다.
		// ㄴ 코드상으로 만들어노은 ""안의 값은 힙(heap) 메모리 영역안에 스트링 풀 이라는 곳에 정의가 된다.
		
		// String 변수 선언하기
		String string = new String("abc");
		
		String string2 = "abc";   // 힙(heap) 영역 안에 하나의 특별한 공간 안에 "abc"가 들어가 있는 String 공간을 먼저 만들어준다.
		
		
		
		// String의 경우, 더하기 연산이 가능하다.
		//  ㄴ 앞의 내용과 뒤의 내용을 모두 String으로 만들고 두 내용을 이어 붙여라 라는 뜻이 됟다.
		
		// ex) string + "DEF" 를 하게 되면?
		//      ㄴ string의 현재 해당 주소값에 저장된 "abc" 라는 글자와 "DEF"를 연결해서 "abcDEF"라는 String을 만들라는 의미가 된다.
		
		// "number의 현재값 : " + number   
		//  ㄴ number변수 안에 저장된 값을 String, 즉 글자로 바꾸고
		//  ㄴ "number의 현재값 : " 뒤에 이어붙이라는 이야기가 된다.
		
		
	}

}
