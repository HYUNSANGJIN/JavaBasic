package day0120;

import java.util.Scanner;

/*
 * 1. 사용자로부터 숫자를입력받아서 
 *    해당 숫자가 한자리, 두자리, 세자리, 네자리 이상의 숫자 중 어떤 것인지 보여주는 프로그램
 *    
 */
public class Ex06IfElseIf2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("숫자를 입력하세요");
       int number = scanner.nextInt();
     
        if(number > 999) {
            System.out.println("네자리 이상의 숫자 입니다");
        }else if(number > 99) {
            System.out.println("세자리 숫자 입니다");
        }else if(number > 9) {
            System.out.println("두자리 숫자 입니다");
        }else {
            System.out.println("한자리 숫자 입니다.");
        }
        

        scanner.close();
    }

}
