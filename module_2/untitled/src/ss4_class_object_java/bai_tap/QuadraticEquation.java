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
        return Math.pow(getB(), 2) - 4 * getA() * getC();
    }

    public void getRoot() {
        double root1;
        double root2;
        if (getDiscriminant() > 0) {
            root1 = (-getB() + Math.pow(getDiscriminant(), 0.5)) / (2 * getA());
            root2 = (-getB() - Math.pow(getDiscriminant(), 0.5)) / (2 * getA());
            System.out.println("Phương trình có 2 nghiệm là " + root1 + " và " + root2);

        } else if (getDiscriminant() == 0) {
            root1 = (-getB()) / (2 * getA());
            System.out.println("Phương trình có nghiệm kép " + root1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập hệ số a: ");
            double a = scanner.nextDouble();
            if (a != 0) {
                System.out.print("Nhập hệ số b: ");
                double b = scanner.nextDouble();
                System.out.print("Nhập hệ số c: ");
                double c = scanner.nextDouble();
                QuadraticEquation equation = new QuadraticEquation(a, b, c);
                equation.getRoot();
                break;
            } else {
                System.out.println("a phải khác 0. Nhập lại đi b ei");
            }
        }
    }
}
