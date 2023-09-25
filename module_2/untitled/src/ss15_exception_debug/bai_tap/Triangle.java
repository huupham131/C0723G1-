package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    private int edgeA;
    private int edgeB;
    private int edgeC;
    Scanner scanner = new Scanner(System.in);

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

    public static int inputEdge() throws IllegalTriangleException {
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input Edge:");
                int edge = Integer.parseInt(sc.nextLine());
                if (edge <= 0) {
                    throw new IllegalTriangleException("Edge must be greater than 0");
                } else {
                    return edge;
                }
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Edge is Integer");
            }
        } while (true);
    }

    public static void main(String[] args) throws IllegalTriangleException {
        do {
            try {
                int a = inputEdge();
                int b = inputEdge();
                int c = inputEdge();
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
