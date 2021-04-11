package day0120;
/*
 * 1. BMI 계산기를 만들어서 사용자의 BMI 수치와 현재 체중 상태를 출력하는 프로그램을 작성하시오.
 
단, 사용자가 잘못된 키나 몸무게를 입력하면 올바른 값을 입력할 때까지 다시 입력을 받으세요

심화 : 모든 숙제에 대해 하드코딩이 아닌 소프트코딩을 적용시키세요.
 */
import java.util.Scanner;

public class Homework1 {
    static final double MAX_HEIGHT_LIMIT = 2.72;
    static final double MAX_WEIGHT_LIMIT = 100;
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // 1번문제
        System.out.print("키(m로 변환) : ");
        double height = scanner.nextDouble();
        
        while(height>MAX_HEIGHT_LIMIT) {
            System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
            System.out.println("키 : ");
            height = scanner.nextDouble();
        }
        System.out.print("몸무게 : ");
        double weight = scanner.nextDouble();
        

         while(weight>MAX_WEIGHT_LIMIT) {
            System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
            System.out.println("몸무게 : ");
            weight = scanner.nextDouble();
        }
        

        
        double bmi = weight/ height / height;
        System.out.printf("bmi 수치 : %.2f\n", bmi);
        
        if(bmi < 18.5) {
            System.out.println("저체중");
        }else if(bmi < 23) {
            System.out.println("정상");
        }else
            System.out.println("비만");
        
        System.out.println("프로그램 끝.");
        
  
        scanner.close();
    }

}
