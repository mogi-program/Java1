package ai0611.car;

import java.util.Scanner;

public class Bus extends Car{
    @Override
    public void SpeedUp() {
        super.SpeedUp();
        if(speed > 60){
            speed = 60;
        }
        System.out.println("버스의 현재 속도 :" + speed);
    }
}
