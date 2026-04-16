package ai0402;

import java.util.Scanner;

public class DriverLicenseTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("===== 운전면허필기시험 학격여부 확인 =====");
        System.out.print("점수를 입력하세요 : ");
        int score = s.nextInt();

        if(score >= 70){
            System.out.println("합격");
        }
        else{
            System.out.println("불합격");
        }


        s.close();
    }
}
