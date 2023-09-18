package ss11_dsa_stack_queue.bai_tap.reverse.string;

import java.util.Arrays;
import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        String string = "Pham Thanh Huu";
        System.out.println("String before reverse: " + string);
        String[] wordArray = string.split(" ");
        for (String s : wordArray) {
            stack.push(s);
        }
        String newString = "";
        for (int i = 0; i < stack.size(); i++) {
            newString += stack.pop();
            if (!stack.isEmpty()) {
                newString += " ";
            }
            i--;
        }
        System.out.println("String after reverse: " + newString);
    }
}
