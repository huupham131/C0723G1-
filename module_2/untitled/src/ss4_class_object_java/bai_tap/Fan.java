package ss4_class_object_java.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isStatus() {
        return status;
    }

    public Fan() {
    }

    public String toString() {
        if (isStatus()) {
            return "Fan is on. Color: " + getColor() + ". Has a radius of " + getRadius() +" And speed: " + getSpeed();
        } else {
            return "Fan is off. Color: " + getColor() + ". Has a radius of " + getRadius();
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        System.out.println(fan1);
        Fan fan2 = new Fan();
        fan1.setSpeed(fan2.MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setStatus(false);
        System.out.println(fan2);
    }
}
