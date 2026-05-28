package ai0521.rabbit;

public class RunRabbit {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit("좁은 네모");

        rabbit1.setPosition(50, 50);
        rabbit2.setPosition(150, 70);

        rabbit1.setShape("기본");
        System.out.printf("%s 모양의 토끼는 (%d, %d) 좌표에 위치하고 있다. \n", rabbit1.getShape() ,rabbit1.getxPos(), rabbit1.getyPos());
        System.out.printf("%s 모양의 토끼는 (%d, %d) 좌표에 위치하고 있다. \n", rabbit2.getShape() ,rabbit2.getxPos(), rabbit2.getyPos());

        rabbit1.setShape("다이아몬드");
        rabbit1.setxPos(rabbit1.getxPos() + 60);
        rabbit1.setyPos(rabbit1.getyPos() - 20);
        rabbit1.printInfo();
    }
}
