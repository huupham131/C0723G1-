package ss11_dsa_stack_queue.bai_tap.decimal_to_binary.decimaltobinary;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal:");
        float numberFloat = Float.parseFloat(scanner.nextLine());
        int numberInt = (int) numberFloat;
        do {
            if (numberInt % 2 == 0) {
                stack.push("0");
                numberInt = numberInt / 2;
            } else {
                stack.push("1");
                numberInt = numberInt / 2;
            }
        } while (numberInt > 0);
        String newString = "";
        for (int i = 0; i < stack.size(); i++) {
            newString += stack.pop();
            if (!stack.isEmpty()) {
                newString += " ";
            }
            i--;
        }
        System.out.println("Binary = " + newString);
    }
}
