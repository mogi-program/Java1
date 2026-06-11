package ai0611.car;

public class SportsCar extends Car{
    @Override
    public void SpeedUp() {
        super.SpeedUp();
        if(speed > 200){
            speed = 200;
        }
        System.out.println("스포츠카의 현재 속도 :" + speed);
    }
}
