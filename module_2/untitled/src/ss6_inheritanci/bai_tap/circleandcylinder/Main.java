package ss6_inheritanci.bai_tap.circleandcylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "white");
        Cylinder cylinder1 = new Cylinder(6, "black", 10);
        System.out.println(circle);
        System.out.println(cylinder1);
    }
}