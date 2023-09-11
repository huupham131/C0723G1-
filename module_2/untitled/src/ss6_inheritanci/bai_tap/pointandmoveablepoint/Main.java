package ss6_inheritanci.bai_tap.pointandmoveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(2);
        point.setY(3);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setXY(2,3);
        moveablePoint.setSpeed(4,5);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
