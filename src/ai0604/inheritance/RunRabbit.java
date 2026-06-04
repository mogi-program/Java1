package ai0604.inheritance;

public class RunRabbit {
    public static void main(String[] args) {
        Rabbit r1 = new Rabbit();

        HouseRabbit r2 = new HouseRabbit();
        r2.shape = "동그라미";
        r2.setPosition(30, 50);
        r2.moveRightX10();
        r2.printInfo();
        r2.masterName = "폴리";
        r2.eatFeed("아주 좋은");

        MountainRabbit r3 = new MountainRabbit();
        r3.shape = "세모";
        r3.moveLeftX10();
        r3.moveLeftX10();
        r3.printInfo();
        r3.mountainName = "남산";
        r3.eatGrass("클로버");
    }
}
