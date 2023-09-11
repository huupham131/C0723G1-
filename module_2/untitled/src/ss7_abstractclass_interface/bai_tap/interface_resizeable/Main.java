package ss7_abstractclass_interface.bai_tap.interface_resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1, "black", true);
        shapes[1] = new Rectangle(2, 4, "white", false);
        shapes[2] = new Square(3, "pink", true);
        //Bai1
        System.out.println("Before resize");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("After resize");
        for (Shape shape : shapes) {
            double percent = Math.random() * 100;
            shape.resize(percent);
            System.out.println(shape);
            //Bai 2
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
