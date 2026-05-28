package ai0528.access.modifier;

import ai0528.access.Rabbit;

public class RunRabbit {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();

        rabbit.setShape("동그라미");
        rabbit.printInfo();
        rabbit.setPosition(50, 80);
        rabbit.printInfo();
    }
}
