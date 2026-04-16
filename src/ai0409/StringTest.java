package ai0409;

public class StringTest {
    public static void main(String[] args) {
        String s = "난생처음 자바";
        int len = s.length();
        System.out.printf("내용 : %s\n", s);
        System.out.printf("길이 : %d\n", len);

        s = "Software 입니다";
        System.out.println("대문자로 출력" + s.toUpperCase());
        System.out.println("소문자로 출력" + s.toLowerCase());

        s = "    인공 지능 소프트웨어      ";
        System.out.println("trim전: " + s);
        System.out.println("trim후: " + s.trim());
    }
}
