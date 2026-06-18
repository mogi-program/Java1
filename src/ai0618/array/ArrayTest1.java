package ai0618.array;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        // 5개의 성적을 입력받아서 저장할 수 있는 1차원 배열객체를 생성
        int[] scores = new int[5];
        String[] subject = {"프로그래밍언어실습", "데이터베이스", "융합UI실습", "인공지능개론", "직업과경력개발"};
        int sum = 0;

        // 콘솔창에서 키보드로 입력한 성적을 가져와서 배열에 저장
        Scanner s = new Scanner(System.in);


        for(int i = 0 ; i < 5 ; i++){
            System.out.print(subject[i]+" 성적입력(정수값): ");
            scores[i] = s.nextInt();
        }

        //배열에 저장된 성적을을 한줄로 출력하고,
        //그 다음줄에 성적의 전체 합계가 출력되기 하세요

//        for(int i = 0; i<5 ; i++){
//            sum += scores[i];
//        }
//        for(int i = 0; i<5 ; i++){
//            System.out.print(scores[i]);
//        }
        int i = 0;

        for(int score : scores){
            sum += score;
            System.out.print(subject[i] + " : " + score);
            i++;
        }

        System.out.println();
        System.out.println(sum);



        s.close();

    }
}
