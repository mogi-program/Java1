package ai0604.inheritance;

public class HouseRabbit extends Rabbit{
    String masterName;

    public void eatFeed(String feedName){
        System.out.println("집토끼가 " + masterName + "이(가) 주는 "+feedName+" 사료를 먹는다");
    }

    @Override
    public void moveLeftX10() {
        this.xPos -= 20;
    }
}
