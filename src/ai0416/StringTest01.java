package ai0416;

public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "블랙핑크";
        for(int n = s1.length() - 1; n >= 0 ; n-- ){
            System.out.print(s1.charAt(n));
        }
    }
}
