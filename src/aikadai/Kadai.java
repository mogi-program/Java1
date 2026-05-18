package aikadai;

import java.util.Random;
import java.util.Scanner;

public class Kadai {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("=========주사위 프로그램=========");
        boolean rerole = true;
        while (rerole){
            System.out.println("주사위 면의 수를 입력하세요");
            int side = s.nextInt();

            System.out.println("주사위의 갯수를 입력하세요");
            int count = s.nextInt();

            int[] dice = new int[count + 1];

            for(int i = 0 ; i <= count ; i++ ){
                dice[i] = r.nextInt(side) + 1;
            }
            System.out.print("나온 주사위 눈 :");
            for(int n : dice){
                System.out.print(n+" ");
            }
            System.out.println();

            boolean re = true;
            while(re){
                System.out.println("한번 더 굴리겠습니까?(네/아니요)");
                String yesno = s.next();

                if(yesno.equals("네")){
                    System.out.println("=========주사위를 다시 굴립니다=========");
                    rerole = true;
                    re = false;
                }
                else if(yesno.equals("아니요")){
                    System.out.println("=========프로그램을 종료합니다=========");
                    rerole = false;
                    re = false;
                }
                else{
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
                    re = true;
                }
            }

        }


        s.close();
    }
}
