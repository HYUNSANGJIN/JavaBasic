package day0120;

import java.util.Scanner;

/*
 * 사용자로부터
 * 국어 영어 수학 점수를 입력 받아서
 * 모든 점수가 60점 이상이고
 * 평균이 70점 이상이면 합격
 * 그 외에는 불합격이 뜨는 프로그램을 작성하시오
 * 
 * 하드코딩
 * ㄴ "경직된"코딩이란 의미로 변경은 어려운 형태의 코딩
 * ㄴ 장점 : 빠르다. 쉽다
 * ㄴ 단점 : 유지보수가 어렵다
 * 
 * 소프트코딩
 * ㄴ "유연한" 코딩이란 의미로써 변경이 쉬운 형태의 코딩
 * ㄴ 장점 : 유지보수가 쉽다
 * ㄴ 단점 : 쉬운 난이도의 프로그래밍에서는 오히려 코딩의 난이도를 높여버린다..
 * 
 * 하드코딩과 소프트코딩의 가장 큰 차이점
 * ㄴ 상수 혹은 변수
 * 
 * 리팩토링
 * ㄴ 코드의 결과는 바뀌지 않지만 내부적으로 더욱 효율적인 코드로 교체하는 것
 * 
 */
public class Ex11GradeBook {
    static final int MIN_SCORE_LIMIT = 60;   // 한번에 바꿀수 있음 (MIN_XXX_LIMIT)
    static final int MIN_SUM_LIMIT = 210;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("국어 : ");
        int korean = scanner.nextInt();
        
        System.out.print("영어 : ");
        int english = scanner.nextInt();
        
        System.out.print("수학 : ");
        int math = scanner.nextInt();
        int sum = korean + english + math;
        
        if(korean >= MIN_SCORE_LIMIT && 
                english >= MIN_SCORE_LIMIT && 
                math >= MIN_SCORE_LIMIT &&
                sum >= MIN_SUM_LIMIT) {
            System.out.println("합격");
            
            
            
        }else {
            System.out.println("불합격");
        }
        
        
        
        
        
        
        scanner.close();        
    }

}
