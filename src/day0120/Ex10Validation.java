package day0120;

import java.util.Scanner;

/*
 * 사용자로부터 키와 몸무게를 입력받아서
 * BMI를 계산하는 프로그램을 작성하시오
 * BMI 18.5 미만 : 저체중
 *     23   미만 : 정상체중
 *     25   미만 : 과체중
 *     그외           : 비만
 *     
 * 기네스북에 따르면 세계에서 가장 키가 컸던 사람은 2.72m였습니다.
 * 기네스북에 따르면 세계에서 가장 무거웠던 사람은 465kg였습니다
 * 2개의 정보를 사용해서 데이터 검증도 적용하세요.
 * 
 */
public class Ex10Validation {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("키를 m단위로 입력하세요");
        double height = scanner.nextDouble();
        
        if(height <= 2.72 && height >0) {
            
            System.out.println("몸무게를 kg단위로 입력하세요");
            double weight = scanner.nextDouble();
            
            if(weight <=465 && weight >0) {
                
                double bmi = weight / height / height;
                System.out.printf("당신의 bmi는  %.3f\n", bmi);
                
                if(bmi < 18.5) {
                    System.out.println("저체중");
                }else if(bmi < 23) {
                    System.out.println("정상");
                }else if(bmi < 25) {
                    System.out.println("과체중");
                }else {
                    System.out.println("비만");
                }
            }else {     // 몸무게 조건식 끝
                System.out.println("몸무게를 잘못 입력하였습니다");
            }
        }else {         // 키 조건식 끝
            System.out.println("키를 잘못 입력하였습니다.");
        }
        
         
        scanner.close();
    }

}
