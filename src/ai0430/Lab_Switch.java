package ai0430;

import java.util.Scanner;

public class Lab_Switch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("출생 연도에 따른 12간지");
        System.out.print("출생 연도를 입력하세요 : ");
        int birthyear = s.nextInt();
        String animal = "";

        switch (birthyear % 12){
            case 0:
                animal = "원숭이";
                break;
            case 1:
                animal = "닭";
                break;
            case 2:
                animal = "개";
                break;
            case 3:
                animal = "돼지";
                break;
            case 4:
                animal = "쥐";
                break;
            case 5:
                animal = "소";
                break;
            case 6:
                animal = "호랑이";
                break;
            case 7:
                animal = "토끼";
                break;
            case 8:
                animal = "용";
                break;
            case 9:
                animal = "뱀";
                break;
            case 10:
                animal = "말";
                break;
            case 11:
                animal = "양";
        }
        System.out.printf("출생년도 %d는 %s띠입니다", birthyear, animal);
        s.close();
    }
}
