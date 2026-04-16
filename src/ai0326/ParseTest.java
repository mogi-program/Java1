package ai0326;

public class ParseTest {
    static void main(String[] args) {
        String num1 = "2026";
        String num2 = "3.14";

        int parseNum1 = Integer.parseInt(num1);
        double parseNum2 = Double.parseDouble(num2);

        System.out.println(parseNum1);
        System.out.println(parseNum2);
    }
}
