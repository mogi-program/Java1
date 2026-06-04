package ai0604;

public class StataicTest {
    public static void main(String[] args) {
        System.out.println("count 클래스 변수의 초기값: "+Rabbit.count);

        Rabbit r1 = new Rabbit();
        System.out.println("count 클래스 변수의 값: " + Rabbit.count);

        Rabbit r2 = new Rabbit();
        System.out.println("count 클래스 변수의 값: " + Rabbit.count);
    }
}
