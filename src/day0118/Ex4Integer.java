package day0118;
/*
 * 기본형 데이터타입 01 - 정수형
 * - 정수 : 소수가 없는 온전한 숫자들
 *      : 대표적으로 자연수가 있다(0~무한)
 *      : 프로그래밍에서는 정수형 기본 데이터타입 4종류가 있다
 *        ㄴ byte - 8비트         -2의 7승 ~ 2의 7승 - 1까지(-128~128까지)
 *        ㄴ short - 16비트     -2의 15승 ~ 2의 15승 - 1까지(-1.6만 ~ 1.6만까지)
 *        ㄴ int - 32비트          -2의 31승 ~ 2의 31승 -1까지 (-20억 ~ 20억)
 *        ㄴ long - 64비트        -2의 63승 ~ 2의 63승 - 1까지
 *        
 * 
 * 컴퓨터에서는 가장 왼쪽 자리가 0이면 +, 1이면 -를 뜻한다
 * ㄴ byte를 기준 
 * 
 *  + 중에 가장 작은 숫자 
 *  ㄴ 0000 0000 -> 0
 *  
 *  + 중에 가장 큰 숫자
 *  ㄴ 0111 1111 -> 127
 *  
 *  - 중에 가장 작은 숫자
 *  ㄴ 1000 0000 -> -128
 *  
 *  - 중에 가장 큰 숫자
 *  ㄴ 1111 1111 -> -1
 *  
 *  
 * overflow - 데이터타입의 최대값보다 큰 값이 들어와서 최소값으로 향하는 것
 * underflow - 최대값으로 향하는 것
 * 
 * 
 * 자바에서는 기본적으로 이러한 기본형 데이터타입들이 있지만 코드 안의 숫자는 기본적으로 int형으로 인식 된다.
 * 
 * 정수형 데이터타입을 사용할 때
 *   ㄴ +- 20억의 범위 안이라면 int를 쓰고
 *   ㄴ 벗어나는 경우에는 long쓴다
 */
public class Ex4Integer {

}
