package ai0521.rabbit;

public class Rabbit {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y){
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
    }

    public Rabbit(String shape) {
        this.shape = shape;
    }
}
