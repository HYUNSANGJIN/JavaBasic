package day0120;

import java.util.Scanner;

/*
 * 사용자로부터 생년, 생월, 생일을 따로따로
 * 입력받아서 형식에 맞추어 출력해보아라
 * 
 */
public class Hw03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("태어난 연도를 입력해라");
        int year = scanner.nextInt();
        
        System.out.println("태어난 달을 입력해라");
        int month = scanner.nextInt();
        
        System.out.println("태어난 일을 입력해라");
        int day = scanner.nextInt();
        
        year = year % 100;
        System.out.println("주민등록번호 앞자리 : "+ year + month + day);
        
        scanner.close();
    }
}
