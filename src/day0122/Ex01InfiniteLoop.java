package day0122;
/*
 * 무한루프
 * ㄴ 우리가 강제로 종료시키기 전까지는 영원히 돌아가는 반복문
 * ㄴ 만드는 방법은 매우 다양하며
 * ㄴ for반복문으로도 무한루프가 가능
 * ㄴ while 반복문으로도 무한루프가 가능
 * ㄴ 각각의 반복문을 이용하여 무한루프 만들기
 * 
 */
public class Ex01InfiniteLoop {
    public static void main(String[] args) {
//      System.out.println("===========1번============");
//     // 1. for 반복문에서 만약 조건식이 항상 참이 나오는 조건식이라면?
//      for(int i = 1; i >= 0; i++) {
//          System.out.println("무한루프 1번");
//      }
      
      //2. for 반복문에서 만약 변화식이 없으면?
//      for(int i = 1; i<=3;) {
//          System.out.println("무한루프 2번");
//      }
      
      //3. for 반복문 안에 아무것도 넣지 않는다면?
//      for(;;) {
//          System.out.println("무한루프 3번");
//      }
      
      //4. while 반복문 조건식 안의 변수에 변화가 없으면?
//      int number = 0;
//      while(number == 0) {
//          System.out.println("무한루프 4번");
//      }
      
      //5. while 반복문의 조건식이 항상 참이 나오면?
//      while(1 >= 0) {
//          System.out.println("무한루프 5번");
//      }
      
      //6. while(true)
      while(true) {
          System.out.println("무한루프 6번");
      }
      
      // 무한루프가 항상 나쁜 것이 아니다.
      // 무한루프가 나쁜 경우: 여러분이 의도하지 않은 상태에서 무한루프에 들어갔을 때
      // 우리가 의도하고 무한루프를 사용하는 경우가 있다.
      // 대표적으로 메뉴를 보여주는 코드가 무한루프를 의도적으로 사용하는 경우이다.
      
      
      
    }
}