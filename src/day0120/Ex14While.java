package day0120;
/*
 * 반복문 - while
 * ㄴ 특정 조건을 만족하는 동안 특정 코드들을 반복시키는 코드이다.
 * 
 * 반복문(while, for)
 * ㄴ 2개의 사용목적이 다르다
 * ㄴ while 반복문 : 횟수의 제한 없이 특정 조건을 만족하는 동안 계속 반복
 * ㄴ for 반복문 : 어느정도 반복 횟수가 정해져있고 그 횟수 만큼 반복함
 * 
 * while 반복문은 다음과 같은 형태를 가진다
 * while(조건식) {
 *     조건식이 참인 동안 반복할 코드
 *     }
 *     
 */
public class Ex14While {
    public static void main (String[] args) {
        int number = 3;
        
        while(number < 0) {
            System.out.println("반복되는 코드!");
            System.out.println("number의 현재값 : " + number);
            number--;
        }
        
        System.out.println("프로그램 끝");
        
    }

}
