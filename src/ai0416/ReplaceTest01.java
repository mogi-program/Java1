package ai0416;

public class ReplaceTest01 {
    public static void main(String[] args) {
        String s = "";
        String s1 = new String("한국 폴리텍 대학      서울       정수       캠퍼스      ");
        String s2 = s1.replaceAll(" ", "");
        System.out.println("원래문자열: " + s1);
        System.out.println("바꾼문자열: " +s2);

        s1 = "인공지능소프트웨어과 1학년";
        System.out.println("\"지능\"의 인덱스번호: " + s1.indexOf("지능")); //몇번째 인덱스에 해당 문자열이 존재하는지 찾는 함수
        System.out.println("\"웨\"의 인덱스번호: " + s1.indexOf("웨"));

        s1 = "한국에는 한국 폴리텍대학이 한국 전체에 많은 곳에 캠퍼스가 위치해 있습니다.";
        System.out.println("8번째 이후에 존재하는 \"한국\"의 인덱스 번호 :" + s1.indexOf("한국", 8));
        // 두번째 매개변수는 해당 문자열을 몇번째 인덱스 이후에서 찾을것인지 추가로 환경설정을 하는 매개변수
    }
}
