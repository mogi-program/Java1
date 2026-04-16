package ai0326;

import java.util.Scanner;

public class Bmitest {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("체중을 입력하세요 : ");
        int weight = s.nextInt();
        System.out.print("키를 입력하세요 : ");
        double height = s.nextDouble();
        double bmi = weight / ((height/100)*(height/100));
        System.out.println("BMI 결과 : " + bmi);
        s.close();


    }
}
