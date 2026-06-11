package ai0611.car;

import java.util.Scanner;

public class Car {
    protected int speed;
    Scanner s = new Scanner(System.in);
    public void SpeedUp(){
        System.out.print("증가할 속도 ===> ");
        int i = s.nextInt();
        speed += i;
    }
}
