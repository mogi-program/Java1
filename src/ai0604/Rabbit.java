package ai0604;

public class Rabbit {
    private String shape;
    private int xPos;
    private int yPos;
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

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
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
