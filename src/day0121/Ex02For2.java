package day0121;

import java.util.Scanner;

public class Ex02For2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------1번----------");
		// 1. 1부터 10까지 출력되는 for문을 작성하시오
		int start =1;
		int end = 10;
		
		for(int i= start; i<= end; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("----------2번----------");
		// 2. 8부터 3까지 출력되는 for문을 작성하시오
		 start = 8;            		 // int 선언 안하는 이유는 앞에서 이미 선언을 하여서 하면 중복선언이 되버림
		 end = 3;
		 
		 for(int i = start; i>=end;i--) {
			 System.out.println(i);
		 }
		 
		 
		 System.out.println("----------3번------------");
		// 3. 사용자로부터 시작 숫자와 끝 숫자를 입력받아서 
		//     그 숫자들을 차례대로 출력하시오
		 System.out.print("시작 지점 : ");
		 start = scanner.nextInt();
		 
		 System.out.print("끝 지점 : ");
		 end = scanner.nextInt();	
		 
		 if(start <= end) {                           // 적은 숫자에서 많은 숫자를 뽑을때
			                                          // if문 안에 for문을 넣는다.
		 for(int i=start;i<=end;i++) {
			 System.out.println(i);
		 }
		 
		 }else {                                     // 많은 숫자에서 적은 숫자를 뽑을때
			 for(int i=start;i>=end;i--) {
				 System.out.println(i);
			 }
		 }
		 
		 
		 System.out.println("-------------4번-------------");
		 //4. 사용자로부터 숫자를 하나 입력 받아서 
		 //    1부터 그 수까지의 홀수들만 출력하시오
		start = 1;
		
		System.out.print("숫자를 입력해주세요 : ");
		end = scanner.nextInt();
		
		for(int i = start; i<=end;i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}

		}
		
		
		System.out.println("------------5번-------------");
		// 5. 사용자로부터 숫자를 하나 입력 받아서 
		//    1부터 그 수 까지의 합을 구하시오
		start = 1;
		
		System.out.print("숫자 : ");
		end = scanner.nextInt();
		
		int sum = 0;
		for(int i=start;i<=end;i++) {
			sum += i;
			
			System.out.printf("1부터 %d 까지의 합 : %d\n", end, sum);
			}
		
		System.out.println("-------------6번----------");
		// 6. 사용자로부터 숫자를 하나 입력 받아서 
		//    1부터 그 수까지의 곱을 구하시오 
		
		start = 1;
		
		System.out.print("숫자 : ");
		end = scanner.nextInt();
		int factorial = 1;
		
		if(end>=13) {
			System.out.println("오버플로우가 발생하여 정확한 결과를 출력할 수 없습니다.");
		}else {

			for(int i=start; i<=end; i++) {
				factorial *= i;
			}
			System.out.printf("1부터 %d까지의 곱: %d\n", end, factorial);
					
		}
		
		
		

		
		
		
		
		
		
		scanner.close();
	}

}
