package ai0611.interfacetest;

public class RunCarMain {
    public static void main(String[] args) {
        Sportage sportage = new Sportage();
        System.out.println(Car.PRODUCT);
        System.out.println(Car.ADDRESS);
        sportage.start();
        sportage.upSpeed(50);
    }
}
