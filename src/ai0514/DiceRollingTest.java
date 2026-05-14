package ai0514;

import java.util.Random;

public class DiceRollingTest {
    public static void main(String[] args) {
        Random r = new Random();
        int count = 0;
        while (true){
            int num1 = r.nextInt(6) + 1;
            int num2 = r.nextInt(6) + 1;
            int num3 = r.nextInt(6) + 1;
            count++;
            if(num1 == num2 && num2 == num3){
                System.out.printf("3개의 주사위는 모두 %d입니다\n", num1);
                System.out.printf("같은 숫자가 나올 때까지 %d번 던졌습니다", count);
                break;
            }
        }

    }
}
