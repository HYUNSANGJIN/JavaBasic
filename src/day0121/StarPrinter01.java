package day0121;

import java.util.Scanner;

// 별찍기 1번
public class StarPrinter01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("******별찍기 1번******");
		System.out.print("출력할 줄 수를 입력하세요 : ");
		int userNumber = scanner.nextInt();
		
		// i for문은 총 몇줄이 출력될지를 결정하게 된다.
		for(int i=1; i<=userNumber; i++) {
			
			// 해당 줄의 출력 내용을 저장할 String  변수
			String stars = new String();             // 
			
			// j for문은 해당 줄의 어떤 내용이 출력될지를 결정하게 된다.
			for(int j=1; j <= i; j++) {       // i가 증가되니깐..
				stars += "*";                // stars에 *을 이어 붙여줄거다..
				
			}
			System.out.println(stars);
		}
		
		
		
				
		scanner.close();
	}

}
