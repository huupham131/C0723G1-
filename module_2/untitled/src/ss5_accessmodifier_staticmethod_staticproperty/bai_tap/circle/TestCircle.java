package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(" Hinh tron co ban kinh la " + circle.getRadius() + " va co dien tich la " + circle.getArea());
    }
}
/*
Thay đổi access modifier cho getRadius và getArea:
private: xảy ra lỗi vì không nằm chung 1 class
protected: không có lỗi.
default: không có lỗi
 */