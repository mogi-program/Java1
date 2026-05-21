package ai0521.car;

public class RunCar {
    public static void main(String[] args) {
        Car sonata = new Car("현대자동차", "소나타", 1600, "은색", 30000000);
        System.out.println("이름: "+sonata.getName());
        System.out.println("제조사: "+sonata.getProduct());
        System.out.println("색: "+sonata.getColor());
        System.out.println("가격: "+sonata.getPrice());
        System.out.println("배기량: "+sonata.getDisplacement());

        sonata.startOn();
        sonata.drive();
        sonata.foward();
        sonata.rotate("좌");
        sonata.drive();

        Car ev6 = new Car();

        ev6.setName("ev6");
        ev6.setProduct("기아자동차");
        ev6.setColor("초록색");
        ev6.setPrice(600000000);
        ev6.setDisplacement(3200);
    }
}
