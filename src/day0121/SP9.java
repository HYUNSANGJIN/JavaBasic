package day0121;

import java.util.Scanner;
public class SP9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********별찍기 9번******");
        System.out.print("출력할 줄 수를 입력하세요");
        int userNumber = scanner.nextInt();
        
        for(int i=1; i<=userNumber*2-1;i++) {
            String stars = new String();
            
          //윗부분
            if(i<=userNumber-1) {
                
                
                //공백
                for(int j=1; j<=userNumber-i;j++) {
                    stars += " ";
                }
                //별
                for(int j=1; j<=2*i-1;j++) {
                    stars += "*";
                }
            }else {
              //아랫부분
                int lowerI = 2*userNumber-i;
                
                // i -> 5 6 7 8 9
                //   -> 5 4 3 2 1        
                // 2 * userNumber - i
                        
                //공백
                 for(int j=1; j<=userNumber-lowerI;j++) {
                      stars += " ";
                        }
                
                //별
                for(int j=1; j<=2*lowerI-1;j++) {
                     stars += "*";
                        }
            }
            System.out.println(stars);
        }
        
        scanner.close();
    }

}
