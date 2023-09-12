package ss6_inheritanci.bai_tap.pointandmoveablepoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    MoveablePoint (){
    }
    MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MoveablePoint(float x,float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public  void setSpeed(float xSpeed,float ySpeed){
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }
    public float[] getSpeed(){
        float[] xySpeed = {this.getxSpeed(),this.getySpeed()};
        return xySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{"+"x,y="+ Arrays.toString(super.getXY()) + "Speed="+ Arrays.toString(this.getSpeed()) + '}';
    }

public MoveablePoint move(){
        super.setX(super.getX()+this.getxSpeed());
        super.setY(super.getY()+this.getySpeed());
        return this;
}
}
