package day0120;

import java.util.Scanner;

public class Ex13Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("월 : ");
        int month = scanner.nextInt();
        
        switch(month){
        case 2:
            System.out.println("28일까지 입니다.");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("30일까지입니다");
            break;
            default :
                System.out.println("31일 까지입니다");
                break;
        }
        
        
        
        scanner.close();
    }

}
