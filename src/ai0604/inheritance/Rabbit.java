package ai0604.inheritance;

public class Rabbit {
    //super 클래스의 필드 또는 메스도 앞에 private를 붙이면 sub클래스의 사용이 제한된다.
    String shape;
    int xPos;
    int yPos;
    public static int count;



    public void moveRightX10(){
        xPos+=10;
    }
    public void moveLeftX10(){
        xPos-=10;
    }
    public void moveUpY10(){
        yPos+=10;
    }
    public void moveDownY10(){
        yPos-=10;
    }

    public void setPosition(int x, int y){
        xPos = x;
        yPos = y;
    }


    public Rabbit() {
        count++;
    }

    public Rabbit(String shape) {
        this.shape = shape;
    }

    public void printInfo() {
        System.out.printf("%s 모양의 토끼는 (%d, %d) 좌표에 위치하고 있다. \n", this.shape, this.xPos, this.yPos);
    }
}
