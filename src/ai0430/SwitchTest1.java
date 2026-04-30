package ai0430;

import java.util.Scanner;

public class SwitchTest1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("1~10까지 중에서 정수 입력");
        int num = s.nextInt();
        String result = "짝수";
        switch (num){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                break;
        }
        System.out.printf("입력된 숫자는 %s 입니다", result);

        s.close();

    }
}
