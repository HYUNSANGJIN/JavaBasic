package day0119;
/**
 * 이름, 나이, 국어, 영어, 수학
 * 총점, 평균, 졸업여부에 해당하는 변수를 각각 만들어주고
 * 해당 변수들을 올바른 값으로 초기화해서
 * 전부다 출력하는 프로그램 작성하라
 * 
 * @author bitcamp
 *
 */
public class Ex08Gradebook {
	public static void main(String[] args) {
		String name = "현상진";
		int age = 26;
		
		int korean = 90;
		int english = 93;
		int math = 97;
		
		int sum = korean + english + math;
		double average = sum / 3.0;        // 평균은 소수점이 나오기 때문에 double!!!!
		
		boolean isGraduated = true;        // 졸업 여부는 true 아니면 false이기 때문에 boolean!!!
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println("졸업여부 : " + isGraduated);
		 
	}

}
