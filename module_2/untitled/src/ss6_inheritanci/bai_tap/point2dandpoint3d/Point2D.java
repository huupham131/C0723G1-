package ss6_inheritanci.bai_tap.point2dandpoint3d;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float[] getXY() {
        float[] xy = {this.getX(), this.getY()};
        return xy;
    }

    @Override
    public String toString() {
        return "Point2D{" + "x=" + this.getX() + ", y=" + this.getY() + " .Array of {x,y} is " + Arrays.toString(this.getXY()) + '}';
    }
}
