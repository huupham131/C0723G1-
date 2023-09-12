package ss7_abstractclass_interface.bai_tap.interface_colorable;


public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1, "black", true);
        shapes[1] = new Rectangle(2, 4, "white", false);
        shapes[2] = new Square(3, "pink", true);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
