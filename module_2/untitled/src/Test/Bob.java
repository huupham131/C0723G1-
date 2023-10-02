package Test;

public class Bob {
    public static void main(String[] args) {
        String msg = "codegym";
        for (int x = 0; x < msg.length() - 1; x++) {
            if (msg.length() == 3) {
                for (int i = 2; i < 7; i++) {
                    System.out.println(i);
                }
            } else {
                for (int i = msg.length(); i > (msg.length() - 2); i--) {
                    System.out.println(i);
                }
            }
        }
    }
}
