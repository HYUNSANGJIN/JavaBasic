package day0120;
/*
 * 사용자로부터 키와 몸무게를 입력 받아서 
 * BMI 수치를 어느정도 형식에 맞추어 출력하시오
 * 
 */
import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("당신의 키를 입력하세요");
        double height = scanner.nextDouble();
        
        System.out.println("당신의 몸무게를 입력하세요");
        double weight = scanner.nextDouble();
        
        double bmi = weight / height / height;
        System.out.printf("사용자의 bmi 수치 : %.3f\n" , bmi);
        
        scanner.close();
    }
}
