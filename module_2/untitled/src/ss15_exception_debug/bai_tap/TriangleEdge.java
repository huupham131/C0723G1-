package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class TriangleEdge {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public void illegalTriangleException(int a, int b, int c){
        System.out.println("Enter edge A:");
        int edgeA = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter edge B:");
        int edgeB = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter edge C:");
        int edgeC = Integer.parseInt(scanner.nextLine());
    }

}
