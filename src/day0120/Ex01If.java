package day0120;
/*
 * 제어문(Control Statement)
 * ㄴ 코드의 실행 혹은 반복을 제어하는 특수한 코드이다.
 * ㄴ 코드의 실행 여부를 결정하는 조건문과 
 * ㄴ 코드의 반복을 제어하는 반복문이 있다.
 * 
 * 조건문
 * ㄴ 어떠한 조건식 혹은 코드의 실행여부를 결정시키는 조건이 있고
 * ㄴ 그 조건식이 true가 나오면 코드 블락을 실행시킨다.
 * ㄴ 만약, 조건식이 false가 나오면 해당 코드 블락은 실행되지 않는다.
 * ㄴ 조건문에는 if, switch 조건문 2가지가 있다.
 * 
 * 코드 블락
 * ㄴ 한개의 중괄호 안의 모든 코드들을 한개의 코드블락이라고 한다.
 * ㄴ 코드 블락 안에는 다른 코드 블락이 들어올 수도 있다.
 * ㄴ 제어문의 실행 여부 , 반복 여부에 따라 실행될 코드가 코드 블락에 있냐 없냐로 결정이 되기 때문이다.
 * ㄴ 또한 변수의 유효범위도 코드 블락과 밀접한 연관이 있다.
 *         ㄴ 범수의 유효범위란 해당 변수가 어디서부터 어디까지 호출 가능한지를 결정하는 범위이다
 *         ㄴ 만약, 변수의 유효범위를 벗어나면 더이상 그 변수는 존재하지 않는것이 되어서 우리가 호출할 수 없다.
 *         ㄴ 어떤 변수가 유효한 범위 안에서는 똑같은 이름의 변수는 우리가 선언할 수 없다.
 *         ㄴ 변수의 유효범위는 해당 변수가 선언 된 이후부터 그 변수가 속해있는 코드블락이 종료될때 까지이다.
 * 
 * 
 * if문
 * ㄴ true/false가 나오는 조건식이 있고
 * ㄴ 그 조건식이 true가 나오면 if문에 속하는 코드 블락이 실행되는 구조이다.
 * ㄴ if문은 다음과 같은 구조를 가진다
 * ㄴ if(조건식){
 *        실행할 코드들
 *        } 
 */
public class Ex01If {
    public static void main(String[] args) {
        int number = 20;
        
        if(number<5) {
            System.out.println("number는 5보다 작습니다.");
            String name = "현상진";
        }
        
    System.out.println("프로그램 종료");
}
}
