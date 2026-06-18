package ai0618.array;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        String[] subject = {"프로그래밍언어실습", "데이터베이스", "융합UI실습"};

        System.out.println(subject.length);
        for(String subjects : subject){
            System.out.print(subjects);
        }
        System.out.println();

        subject = Arrays.copyOf(subject, subject.length + 2);

        System.out.println(subject.length);

        subject[subject.length - 2] = "영상인공지능처리";
        subject[subject.length - 1] = "직업과 경력개발";
        for(String subjects : subject){
            System.out.print(subjects);
        }
    }
}
