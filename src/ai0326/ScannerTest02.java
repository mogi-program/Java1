package ai0326;
import java.util.Scanner;
import java.util.Calendar;


public class ScannerTest02 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("출생 년도를 입력하시오 : ");
        int num = s.nextInt();
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.print("당신의 나이 : " + (year - num));
        s.close();

    }
}
