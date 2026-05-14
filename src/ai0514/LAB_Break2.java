package ai0514;

import java.util.Random;
import java.util.Scanner;

public class LAB_Break2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int num = 0;
        int computerNum = 0;
        Random r = new Random();
        while(true){
            computerNum = r.nextInt(5) + 1;
            System.out.println("게임" + i + "회: 컴퓨터가 생각하는 숫자는 무엇일까요?");
            num = s.nextInt();
            if(computerNum == num){
                System.out.println("축하합니다 맞추셨네요");
                break;
            }
            else{
                System.out.println("안타깝게도 틀리셨네요 다시 시도해보세요");
                i++;
            }
        }
    }
}
