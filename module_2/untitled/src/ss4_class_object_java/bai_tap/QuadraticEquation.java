package ss4_class_object_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getA() {
        return a;
    }

    public double getDiscriminant() {
        double delta;
        return delta = Math.pow(getB(), 2) - 4 * getA() * getC();
    }

    public String getRoot() {
        double root1;
        double root2;
        if (getDiscriminant() > 0) {
            root1 = (-getB() + Math.pow(getDiscriminant(), 0.5)) / (2 * getA());
            root2 = (-getB() - Math.pow(getDiscriminant(), 0.5)) / (2 * getA());
            return "Phương trình có 2 nghiệm là " + root1 + " và" + root2;
        } else {
            return "Phương trình vô nghiệm";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        equation.getRoot();
    }
}
