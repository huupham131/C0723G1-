package ss11_dsa_stack_queue.bai_tap.check_bracket;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> bStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter math expression");
        String string = scanner.nextLine();
        String[] stringArray = string.split("");
        boolean result = true;
        String left = "";
        String temp = "";
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals("(")) {
                bStack.push(stringArray[i]);
                left += stringArray[i];
            } else if (stringArray[i].equals(")")) {
                if (bStack.isEmpty()) {
                    result = false;
                    break;
                } else {
                    temp += bStack.pop();
                }
            }
        }
        if (!(left.length() == temp.length())) {
            result = false;
        }
        if (result) {
            System.out.println("Dung rui ne");
        } else {
            System.out.println("Sai rui ne");
        }
    }

}
