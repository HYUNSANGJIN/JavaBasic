package day0125;

import java.util.Random;
import java.util.Scanner;

/*
 * 숙제
 * ㄴ 가위바위보 게임을 만드세요
 * 가위 : int 1
 * 바위 : int 2
 * 보 : int 3
 * 
 * 예) 가위바위보 중 하나를 선택해주세요(가위: 1 바위 : 2 보 : 3)
 *  > 5
 *  잘못입력하셨습니다.
 *  가위바위보 중 하나를 선택해주세요(가위 :1 바위 :2 보: 3)
 *   > 2
 *   사용자 : 바위
 *   컴퓨터 : 가위
 *   사용자 승!!!
 *   현재 전적 : 1승 3무 2패
 *   
 *   1. 플레이 2. 현재 전적 보기 3. 종료
 *   > 2
 *   현재 전적은 1승 3무 2패입니다. 승률은 16.6667퍼센트입니다.
 *   
 *   1. 플레이 2. 현재 전적 보기 3. 종료
 *    > 3
 *    사용해주셔서 감사합니다.
 */

public class Homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		
		while(true) {
			System.out.println("1. 플레이 2. 현재 전적 보기 3. 종료");
			System.out.print("> ");
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
				// 플레이 코드 
				
				
				System.out.println("가위 바위 보 중 하나를 선택해주세요");
				int userNumber = scanner.nextInt();
				
				int computerNumber = random.nextInt(3) +1;
				
				
				while(userNumber <0 || userNumber>3) {
					System.out.println("잘못 입력하셨습니다");
					System.out.println("가위 바위 보 중 하나를 선택해주세요");
					userNumber = scanner.nextInt();
				}
					
					if(userNumber == 1) {
						if(computerNumber == 1) {
							System.out.println("비겼습니다 !");
							draw++;
						}else if(computerNumber == 2) {
							System.out.println("컴퓨터 승 !");
							lose++;
						}else if(computerNumber == 3) {
							System.out.println("사용자 승 !");
							win++;
						}
						
						System.out.printf("현재 전적 : %d승 %d무 %d패\n", win, draw, lose);
						
					}else if(userNumber == 2) {
						if(computerNumber == 1) {
							System.out.println("사용자 승 !");
							win++;
						}else if(computerNumber == 2) {
							System.out.println("비겼습니다 !");
							draw++;
						}else if(computerNumber == 3) {
							System.out.println("컴퓨터 승!");
							lose++;
						}
						
						System.out.printf("현재 전적 : %d승 %d무 %d패\n", win, draw, lose);
						
					}else if(userNumber == 3) {
						if(computerNumber == 1) {
							System.out.println("컴퓨터 승 !");
							lose++;
						}else if(computerNumber == 2) {
							System.out.println("사용자 승 !");
							win++;
						}else if(computerNumber == 3) {
							System.out.println("비겼습니다 !");
							draw++;
						}
						System.out.printf("현재 전적 : %d승 %d무 %d패\n", win, draw, lose);
					}
				
					
				
			}else if(userChoice == 2) {
				// 현재 전적 보기
				
				System.out.printf("현재 전적은 %d승 %d무 %d패 입니다", win, draw, lose);
				
				double whole = win / win + draw + lose * 100;
				System.out.printf("승률은 %f 퍼센트 입니다.", whole);
				
			}else if(userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		
		
		
	} // while(1) 끝
		scanner.close();
} // main 끝
} // class 끝
