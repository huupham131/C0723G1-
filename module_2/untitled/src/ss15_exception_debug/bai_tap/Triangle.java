package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    private int edgeA;
    private int edgeB;
    private int edgeC;

    public Triangle(int edgeA, int edgeB, int edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    @Override
    public String toString() {
        return "TriangleEdge{" +
                "edgeA=" + edgeA +
                ", edgeB=" + edgeB +
                ", edgeC=" + edgeC +
                '}';
    }

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("three edge are not edge of the triangle");
        }
    }

    public static int checkInput(int x) {
        while (true) {
            if (x > 0) {
                return x;
            } else {
                System.out.println("Edge more than 0");
            }
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        do {
            try {
                System.out.println("Enter a:");
                a = Integer.parseInt(scanner.nextLine());
                checkInput(a);
                System.out.println("Enter b:");
                b = Integer.parseInt(scanner.nextLine());
                checkInput(b);
                System.out.println("Enter c:");
                c = Integer.parseInt(scanner.nextLine());
                checkInput(c);
                checkTriangle(a, b, c);
                Triangle triangle = new Triangle(a, b, c);
                System.out.println(triangle);
                break;

            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Edge is Integer");
            }
        } while (true);
    }
}
