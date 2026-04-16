package ai0326;

import java.util.Scanner;

public class Lab1 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ##");
        System.out.print("받는 사람 : ");
        String name = s.nextLine();
        System.out.print("주소 : ");
        String adress = s.nextLine();
        System.out.print("무게 : ");
        int gram = s1.nextInt();
        int price = gram*5;
        System.out.printf("** 받는 사람 ==> %s \n ** 주소 ==> %s \n ** 배송비 ==> %d\n", name, adress, price);
    }
}
