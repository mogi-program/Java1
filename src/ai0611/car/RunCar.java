package ai0611.car;

import java.util.Scanner;

public class RunCar {
    public static void main(String[] args) {
        Bus bus = new Bus();
        SportsCar sportsCar = new SportsCar();
        Scanner s = new Scanner(System.in);
        String yesno;
        while (true){

            System.out.println("가속을 시작합니다");
            bus.SpeedUp();
            sportsCar.SpeedUp();
            System.out.println("계속하겠습니까? (Y/N)");
            yesno = s.nextLine();

            if(yesno.equals("N")) {
                break;
            }
        }

    }
}
