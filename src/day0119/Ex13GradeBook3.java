package day0119;
/**
 * 사용자로부터 
 * 번호 이름 국어 영어 수학 점수를 차례대로 입력받아
 * 다음처럼 출력될 수 있게 프로그램을 작성하시오
 * 예시)
 * 번호 : 002번 이름 : 현상진
 * 국어 : 004점 영어 : 002점 수학 : 001점\
 * 총점 : 007점 평균 : 02.33점
 * 
 * @author bitcamp
 *
 */
public class Ex13GradeBook3 {
	public static void main(String[] args) {
		int number = 2;
		System.out.printf("번호 : [%03d]\n", number);
		
		String str = new String("현상진");
		System.out.printf("이름 : [%s]\n", str);
		
		int korean = 4;
		System.out.printf("국어 : [%03d]\n", korean);
		
		int english = 2;
		System.out.printf("영어 : [%03d]\n", english);
		
		int math = 1;
		System.out.printf("수학 : [%03d]\n", math);
		
		int sum = korean + english + math;
		System.out.printf("총점 : [%03d]\n", sum);
		
		double average = 02.33;
		System.out.printf("평균 : [%05.2f]\n", average);
	}

}
