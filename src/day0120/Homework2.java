package day0120;

import java.util.Scanner;

/*
 * 2. 사용자로부터 점수를 입력받아 
 * A,B,C,D,F를 출력하는 프로그램을 작성하세요.
 * 단, 잘못된 점수가 입력되면 올바른 점수가 입력될때까지 다시 입력을 받으세요

심화 : 모든 숙제에 대해 하드코딩이 아닌 소프트코딩을 적용시키세요.
 */
public class Homework2 {
    static final double MIN_SCORE_LIMIT = 0;
    static final double MAX_SCORE_LIMIT = 100;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수 : ");
        int score = scanner.nextInt();
        
        
        
        while(score<MIN_SCORE_LIMIT || score>=MAX_SCORE_LIMIT) {
            System.out.println("잘못된 점수입니다.");
            System.out.println("다시 입력하세요.");
            score = scanner.nextInt();
    }
        
            
                if(score>=90 && score<=MAX_SCORE_LIMIT) {
                    System.out.println("A");
                }else if(score>=80) {
                    System.out.println("B");
                }else if(score>=70) {
                    System.out.println("C");
                }else if(score>=60) {
                    System.out.println("D");
                }else {
                    System.out.println("F");
                }
            

            System.out.println("프로그램 종료");
        
        scanner.close();
    }
}

