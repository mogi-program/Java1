package ai0423;

import java.util.Random;
import java.util.Scanner;

public class RockTest {
    public static void main(String[] args) {
        System.out.println("===== 가위바위보 게임 =====");
        Scanner s = new Scanner(System.in);
        System.out.print("* 가위, 바위, 보 중에 하나를 입력: ");
        String me = s.nextLine();

        String[] computer = {"가위","바위","보"};
        Random random = new Random();
        int randNum = random.nextInt(3);
        System.out.println("컴퓨터가 낸 것은 " + computer[randNum] + "입니다");

        if(me.equals("가위")){
            if(computer[randNum].equals("가위")){
                System.out.println("비겼습니다");
            }
            else if(computer[randNum].equals("바위")){
                System.out.println("컴퓨터의 승리!");
            }
            else if(computer[randNum].equals("보")){
                System.out.println("당신의 승리!");
            }
        }
        else if(me.equals("바위")){
            if(computer[randNum].equals("바위")){
                System.out.println("비겼습니다");
            }
            else if(computer[randNum].equals("보")){
                System.out.println("컴퓨터의 승리!");
            }
            else if(computer[randNum].equals("가위")){
                System.out.println("당신의 승리!");
            }
        }
        else if(me.equals("보")){
            if(computer[randNum].equals("보")){
                System.out.println("비겼습니다");
            }
            else if(computer[randNum].equals("가위")){
                System.out.println("컴퓨터의 승리!");
            }
            else if(computer[randNum].equals("바위")){
                System.out.println("당신의 승리!");
            }
        }
    }
}
