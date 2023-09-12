package ss7_abstractclass_interface.bai_tap.interface_colorable;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + " .With area = "
                + this.getArea();
    }


    public double getArea() {
        return this.getSide() * this.getSide();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
