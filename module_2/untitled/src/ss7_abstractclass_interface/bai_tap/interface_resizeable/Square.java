package ss7_abstractclass_interface.bai_tap.interface_resizeable;

public class Square extends Rectangle implements Resizeable, Colorable {
    public Square() {
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
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

    @Override
    public void resize(double percent) {
        this.setSide(this.getSide() * (1 + percent / 100));
    }

    public double getArea() {
        return this.getSide() * this.getSide();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
