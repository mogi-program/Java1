package ai0402;

import java.util.Scanner;

public class Ch03LAB1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("파운드(lb)를 입력하세요 : ");
        double a = s.nextInt();
        System.out.printf("%f파운드(lb)는 %f킬로그램(kg)입니다.\n", a, a * 0.453592);
        System.out.print("킬로그램(kg)을 입력하세요 : ");
        double b = s.nextInt();
        System.out.printf("%f킬로그램(kg)은 %f파운드(lb)입니다.", b, b * 2.204623);
    }
}
