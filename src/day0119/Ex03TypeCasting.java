package day0119;
/**
 * 
 * 형변환(Type casting)
 * ㄴ 특정 값을 다른 데이터타입의 값으로 변환시키는 것
 * 
 * 1. 암시적 형변환(implicit type casting)
 *     ㄴ 더 작은 데이터타입의 값을 더 큰 데이터타입으로 바꿀 때 발생된다.
 *     ㄴ 특별히 어떤 명령어를 적지 않아도 자동으로 자바가 변환시켜준다.
 *     
 *     
 * 2. 명시적 형변환(explicit type casting
 *     ㄴ 더 큰 데이터타입의 값을 더 작은 데이터타입으로 바꿀 때 발생된다.
 *     ㄴ 데이터 손실이 발생되더라도 값의 데이터타입을 바꾸라고 명시해주어야 한다.
 *     ㄴ 명시적 형변환   -> 공간 = (바꿀 타입)값;
 *     
 * @author bitcamp
 *
 */
public class Ex03TypeCasting {
	public static void main(String[] args) {
		// 암시적 형변환
		// 더 작은 데이터타입의 값을 더 큰 데이터타입에 옮겨 닮거나 정수 값을 실수로 바꿀때 발생
		byte b = 3;
		int number = b;
		System.out.println("number의 현재값 : " + number);
		
		double d = number;
		System.out.println("d의 현재값 : " + d);
		
		// 명시적 형변환
		// 더 큰 데이터타입의 값을 더 작은 데이터타입에 옮겨 담거나 실수 값을 정수로 바꿀때 발생
		number = 10;
		b = (byte)number;   // int값을 byte값으로 바꿨다.
		System.out.println("b의 현재값 : " + b);
		
		b = (byte)3.14;    // 3.14라는 실수값을 byte로 바꿨다.   -> .14는 빠지고 출력
		System.out.println("b의 현재값 : " + b);
		
		// 오버플로우 언더플로우는 우리가 일반적인 방법으로 발생시킬 수 없지만
		// 형변환을 사용하면 우리가 오버플로우/언더플로우를 발생시킬 수 있다.
		
		// 1. 오버플로우
		//     ㄴ byte에 141을 넣으면?
		b = (byte)141;
		System.out.println("b의 현재값 : " + b);
		// 141 = 128 + 13
		// byte기준으로 128은 오버플로우가 발생해서 -128이 된다.
		// ㄴ 141 = -128 + 13 이 된다
		// ㄴ 결과는 -115
		
		// 2. 언더플로우
		//    ㄴ byte에 -130을 넣으면?
		//    ㄴ -130 = -129 - 1
		//    ㄴ      = 127 - 1
		//    ㄴ      = 126
		b = (byte)-130;
		System.out.println("b의 현재값 : " + b);
	}

}
