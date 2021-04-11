package day0120;

import java.util.Scanner;

//3. 사용자가 번호, 이름, 국어, 영어, 수학 점수를 입력하면 예쁘게 출력하는 프로그램을 작성하세요. 
//단, 사용자가 잘못된 형태의 점수를 입력하면 올바른 형태의 점수를  입력하면
//올바른 형태의 점수를 입력할때까지 다시 입력을 받는 프로그램을 만드세요
//
//심화 : 모든 숙제에 대해 하드코딩이 아닌 소프트코딩을 적용시키세요.
public class Homework3 {
    static final double MIN_SCORE_LIMIT = 20;
    static final double MAX_SCORE_LIMIT = 100;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("번호 : ");
        int number = scanner.nextInt();
        
        System.out.print("이름 : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        System.out.print("국어 : ");
        int korean = scanner.nextInt();
        while(korean>MAX_SCORE_LIMIT || korean < MIN_SCORE_LIMIT) {
            System.out.println("잘못된 점수 입니다.");
            System.out.println("국어 : ");
            korean = scanner.nextInt();
        }
        
        System.out.println("영어 : ");
        int english = scanner.nextInt();
        while(english>MAX_SCORE_LIMIT || english < MIN_SCORE_LIMIT) {
            System.out.println("잘못된 점수 입니다.");
            System.out.println("영어 : ");
            english = scanner.nextInt();
        }

        
        System.out.println("수학 : ");
        int math = scanner.nextInt();
        while(math>MAX_SCORE_LIMIT || math < MIN_SCORE_LIMIT) {
            System.out.println("잘못된 점수 입니다.");
            System.out.println("수학 : ");
            math = scanner.nextInt();
        }

        int sum = korean + english + math;
        double avarage = sum / 3.0;
        
        System.out.printf("사용자 번호 : [%03d]\n", number);
        System.out.printf("이름 : [%s]\n", name);
        System.out.printf("국어 : [%d점]\n", korean);
        System.out.printf("수학 : [%d점]\n", english);
        System.out.printf("영어 : [%d점]\n", math);
        System.out.printf("총점 : [%d점]\n", sum);
        System.out.printf("평균 : [%.2f점]\n", avarage);
        
        
        scanner.close();
    }

}
