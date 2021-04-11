package day0120;

import java.util.Scanner;

/*
 * 예제
 * 1. 사용자로부터 숫자를 입력받아서 
 * 홀수이면 "홀수입니다" 라고 출력하게 만들어라
 * 
 * 2. 사용자로부터 나이를 입력받아서 
 * 성년이면 "성년입니다."를 출력하게 만드세요
 * 
 * 3. 사용자로부터 아이디와 비밀번호를 입력 받아서 아이디가 "admin"이고 비밀번호가 "12345"이면
 * "로그인 성공"이 출력되게 만드세요
 * 
 */
public class Ex02If2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // 1번문제
    System.out.println("숫자를 입력하시오");
    int a = scanner.nextInt();
    if(a%2 == 0) {
        System.out.println("짝수입니다");
        
    }
           
    System.out.println("===================================");
    
    // 2번문제
    System.out.println("나이를 입력하세요");
    int age = scanner.nextInt();
    if(age>=20) {
        System.out.println("성인 입니다.");
    }
    
    
   System.out.println("=====================================");
   
   // 3번문제
   System.out.println("ID : ");
   scanner.nextLine();
   String id = scanner.nextLine();
   
   System.out.println("PW : ");
   String pw = scanner.nextLine();
   
   if(id.equals("admin")&&(pw.equals("12345"))) {
       System.out.println("로그인 성공!");
       
   }
   
   scanner.close();
}
}
