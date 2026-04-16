package ai0416;

public class CharAtTest01 {
    public static void main(String[] args) {
        String s1 = "서울정수";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0)); //해당 인덱스에 어떤 문자가 존재하는지 확인하는 함수
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));
        System.out.println(s1.charAt(3));

        System.out.println(s1.substring(1, 3));//첫번째 매개변수부터 두번째 매개변수'전'까지 추출해서 반환
        char[] c = s1.toCharArray(); //문자열을 문자 배열로 반환
        System.out.println(c[2]);
    }
}
