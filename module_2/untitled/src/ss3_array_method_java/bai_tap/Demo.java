package ss3_array_method_java.bai_tap;

public class Demo {
    public static void main(String[] args) {
        int h = 5;
        for (int i = 1; i <= h; i++) {
            for (int z = 1; z <= 2 * h + 1; z++) {
                if (z == h + i + 1 || z == h - i + 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = h - 1; i >= 1; i--) {
            for (int z = 1; z <= 2 * h + 1; z++) {
                if (z == h + i + 1 || z == h - i + 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


