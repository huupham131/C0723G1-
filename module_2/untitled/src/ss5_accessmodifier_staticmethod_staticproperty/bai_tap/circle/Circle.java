package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

     public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
