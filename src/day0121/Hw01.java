package day0121;
/*
 * 1. BMI 계산기를 만들어서 사용자의 BMI 수치와 현재 체중 상태를 출력하는 프로그램을 작성하시오.
 
단, 사용자가 잘못된 키나 몸무게를 입력하면 올바른 값을 입력할 때까지 다시 입력을 받으세요

심화 : 모든 숙제에 대해 하드코딩이 아닌 소프트코딩을 적용시키세요.
 */
import java.util.Scanner;

public class Hw01 {
	// 사용자 최대 키 값
    static final double MAX_HEIGHT_LIMIT = 2.72;
    // 사용자 최대 몸무게 값
    static final double MAX_WEIGHT_LIMIT = 465;
    // 저체중 BMI 값
    static final double LOW_WEIGHT_BMI = 18.5;
    // 정상 BMI 값
    static final double NORMAL_WEIGHT_BMI = 23;
    // 비만 BMI 값
    static final double OVER_WEIGHT_BMI = 25;
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // 1번문제
        System.out.print("키(m로 변환) : ");
        double height = scanner.nextDouble();
        
        while(height>MAX_HEIGHT_LIMIT) {
            System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
            System.out.println("키 : ");
            height = scanner.nextDouble();
        }       // while문 종료
        
        
        System.out.print("몸무게 : ");
        double weight = scanner.nextDouble();
        

         while(weight>MAX_WEIGHT_LIMIT) {
            System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
            System.out.println("몸무게 : ");
            weight = scanner.nextDouble();
        }        // while문 종료
        

        
        double bmi = weight/ height / height;
        System.out.printf("bmi 수치 : %.2f\n", bmi);
        
        if(bmi < LOW_WEIGHT_BMI) {
            System.out.println("저체중");
        }else if(bmi < NORMAL_WEIGHT_BMI) {
            System.out.println("정상");
        }else if(bmi < OVER_WEIGHT_BMI) {
        	System.out.println("과체중");
        }else {
        	 System.out.println("비만");
        }
        
        System.out.println("프로그램 끝.");
        
  
        scanner.close();
    }

}
