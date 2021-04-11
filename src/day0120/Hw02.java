package day0120;

import java.util.Scanner;

/*
 * 사용자로부터 숫자 2개를 입력받아서 
 * 산술 연산한 결과값을 출력하는 프로그램을 작성하세요
 * 
 */
public class Hw02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("숫자입력 : ");
        int a = scanner.nextInt();
        
        System.out.println("숫자입력 : ");
        int b = scanner.nextInt();
        
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + ((double)a/b));  // 소수점이 나올 수 있으니 dluble
        System.out.println("a % b = " + (a%b));
        
                scanner.close();
    }

}
