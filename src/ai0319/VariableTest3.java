package ai0319;

public class VariableTest3 {
    static void main(String[] args) {
        int n1, n2;
        double result, result2;

        n1 = 301;
        n2 = 50;
        result = (double)n1/n2;
        result2 = (double)n1%n2;
        System.out.printf("%d / %d = %f\n", n1, n2, result);
        System.out.printf("%d %% %d = %f", n1, n2, result2);

    }
}
