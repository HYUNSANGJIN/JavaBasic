package day0126;
/*
 * 배열안에서 중복을 찾는 방법       // 중복 -> 다른칸에 같은 숫자가 있는것

 * ㄴ 사용자로부터 입력을 받아서 
 * ㄴ int[] 안에 넣어주되
 * ㄴ 만약 그 값이 이미 존재하는 경우에는
 * ㄴ 다시 입력하라고 한다.
 * 
 */
import java.util.Scanner; 
public class Ex01Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[4];
        
        for(int i=0; i<intArray.length; i++) {
            System.out.print(i+"번재 값 : ");
            int  userInput = scanner.nextInt();
            
            for(int j=0; j<intArray.length; j++) {
                if(userInput == intArray[j]) {
                    System.out.println("중복된 값입니다.");
                    System.out.print(i+"번째 값 : ");
                    userInput = scanner.nextInt();
                    j = -1;
                }
            }
            
            intArray[i] = userInput;
        }
        
        for(int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        
        scanner.close();
    }

}
