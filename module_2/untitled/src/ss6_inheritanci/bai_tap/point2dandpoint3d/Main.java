package ss6_inheritanci.bai_tap.point2dandpoint3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(2);
        point2D.setY(3);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        point3D.setXY(2, 3);
        point3D.setZ(4);
        System.out.println(point3D);
    }
}
