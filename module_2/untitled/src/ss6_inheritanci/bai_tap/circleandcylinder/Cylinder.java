package ss6_inheritanci.bai_tap.circleandcylinder;

public class Cylinder extends Circle {
    private double height;

    Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + this.getHeight() + ", color = " + this.getColor() + ", radius = " + this.getRadius() + " and has equal volume " + this.getVolume() + '}';
    }
}
