package ai0402;

import java.util.Scanner;

public class ScannerTest3_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("정수 1 입력");
        int num1 = s.nextInt();
        System.out.println("정수 2 입력");
        int num2 = s.nextInt();
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d / %d = %2f\n", num1, num2, (double)num1/num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);

        s.close();
    }
}
