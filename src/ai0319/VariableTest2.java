package ai0319;

public class VariableTest2 {
    static void main(String[] args) {
        int num1, num2, result, result2, result3, result4;

        num1 = 300;
        num2 = 500;
        result = num1 + num2;
        result2 = num1 * num2;
        result3 = num2 / num1;
        result4 = num2 % num1;


        System.out.println(num1 + " + " + num2 + " = " + result);
        System.out.printf("%d + %d = %d\n", num1, num2, result);
        System.out.printf("%d * %d = %d\n", num1, num2, result2);
        System.out.printf("%d / %d = %d\n", num2, num1, result3);
        System.out.printf("%d %% %d = %d\n", num2, num1, result4);

    }
}
