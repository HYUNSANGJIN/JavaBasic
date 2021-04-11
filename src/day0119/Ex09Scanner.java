package day0119;
/**
 * Scanner 클래스

 * ㄴ Scanner 클래스의 변수는 자바의 각종 입력을 처리한다
 * ㄴ 키보드 입력 처리 
 * 
 * 단, Scanner 클래스는 자바에서 제공해주지만 기본 라이브러리에포함되지 않으므로,
 * 우리가 사용하려면 반드시 우리의 클래스에 "수입"해와야 한다. 
 *  ㄴ 수입 방법은 import java.util.Scanner 라고 적어주어야 한다.
 *  
 *  nextInt();
 *  
 *  스캐너 처리 순서
 *  1. 키보드 입력값을 String으로 읽어옴
 *  2. 읽어온 String값이 내가 호출한 메소드에 패턴과 일치하는지 체크
 *  3. 일치하면 내가 원하는 데이터타입으로 변환.
 *  4. 일치하지 않으면 -> 에러
 *  
 * @author bitcamp
 *
 */
import java.util.Scanner;
public class Ex09Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1. int를 입력 받을 때에는 Scanner 변수의 
		//     ㄴ nextInt() 메소드를 실행
		System.out.println("숫자를 입력해주세요.");
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 숫자 : " + number);
		
		
		// 2. double을 입력 받을 때에는 Scanner 변수의
		//     ㄴ nextDouble() 메소드를 실행
		System.out.println("실수를 입력해주세요");
		double d = scanner.nextDouble();
		System.out.println("사용자가 입력한 실수 : " + d);
		
		
		// 3. String을 입력 받을 때에는 Scanner 변수의 
		//     ㄴ nextLine() 메소드를 실행
		
		// 단, nextInt(), nextDouble()등의 숫자를 입력받는 메소드는 
		//    ㄴ 버퍼메모리에 엔터키(=개행문자)를 남겨두고
		//    ㄴ 그 다음에 실행되는 nextLine() 메소드는 남겨진 엔터키를 보고 사용자가 입력을 종료시켰다라고 착각하게 된다.
		//    ㄴ 이 착각때문에 우리는 아무런 String 입력을 할 수 없게 된다.
		//    ㄴ 버퍼메모리 안의 엔터키를 없애주기 위해서 진짜 스트링 입력을 위한 nextLine() 전에
		//    ㄴ 비워주는 nextLine() 을 한번 실행시켜주어야 한다.
		
		System.out.println("이름을 입력해주세요");
		scanner.nextLine();     
		String name = scanner.nextLine();   // 진짜 입력을 받는 nextLine
		System.out.println("사용자의 이름 : " + name);
		
		scanner.close();
	}

}
