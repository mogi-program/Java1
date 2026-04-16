package ai0402;

import java.util.Scanner;

public class ScannerTest03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int a = s.nextInt();
        boolean x = true;
        while(x) {
            System.out.println("연산자를 선택하세요 - (+, -, *, /, %, 계산종료)" );
            String b = s.next();
            if(b.equals("+")){
                System.out.println("더할 값을 입력하세요");
                int c = s.nextInt();
                a = a + c;
                System.out.println("결과 : " + a);
            }
            else if(b.equals("-")){
                System.out.println("더할 값을 입력하세요");
                int c = s.nextInt();
                a = a - c;
                System.out.println("결과 : " + a);
            }
            else if(b.equals("*")){
                System.out.println("더할 값을 입력하세요");
                int c = s.nextInt();
                a = a * c;
                System.out.println("결과 : " + a);
            }
            else if(b.equals("/")){
                System.out.println("더할 값을 입력하세요");
                int c = s.nextInt();
                a = a / c;
                System.out.println("결과 : " + a);
            }
            else if(b.equals("%")){
                System.out.println("더할 값을 입력하세요");
                int c = s.nextInt();
                a = a % c;
                System.out.println("결과 : " + a);
            }
            else if(b.equals("계산종료")){
                x = false;
            }
            else {
                System.out.println("연산자 입력에 실패했습니다. 다시 시도하여 주십시오");
            }
        }
        s.close();
    }
}
