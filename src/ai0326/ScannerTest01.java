package ai0326;

import java.util.Scanner;

public class ScannerTest01 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 : ");
        int num = s.nextInt();
        System.out.println("입력한 값 : " + num);
        s.close();
    }

}
