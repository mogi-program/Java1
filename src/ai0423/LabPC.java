package ai0423;

import java.util.Scanner;

public class LabPC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = s.nextInt();
        if(age >= 20){
            System.out.println("이용 가능 시간대입니다");
        }
        else{
            System.out.println("청소년 이용 불가 시간대입니다. 퇴장부탁드립니다.");
        }

        s.close();
    }
}
