package day0119;
/**
 * 
 * 논리연산자
 * ㄴ boolean 값에 대한 연산을 한다.
 * 
 * 1. AND 연산자 (&&)
 *    ㄴ 2개의 boolean값이 모두 true일때에만 결과가 true가 나온다.
 *    
 * 2. OR 연산자 (||)
 *    ㄴ 2개의 boolean 값중 하나라도 true이면 결과가 true가 나온다.
 *    
 * 3. NOT 연산자 
 *    ㄴ true는 false로 false는 true로 변환해준다.
 *    ㄴ 실제 값이 바뀌지는 않는다.   
 *    
 * @author bitcamp
 *
 */
public class Ex07Operator4 {
	public static void main(String[] args) {
		//  AND연산자
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("flase && false : " + (false && false));
		// AND연산의 경우 앞의 boolean  값이 false일 경우
		// 뒤를 확인 안해도 결과값은 무조건 false이기 때문에
		// false && true 혹은 false && false라고 적으면 뒤의 true와 false에 경고가 뜬다.
		
		System.out.println("================================================");
		
		// OR연산자
		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("flase || false : " + (false || false));
		
		System.out.println("================================================");
		
		// NOT연산자
		boolean b = true;
		System.out.println("b의 현재값 : " + b);
		System.out.println("!b : " + b);
		System.out.println("b의 현재값 : "+ b);
	}

}
