package ss11_dsa_stack_queue.bai_tap.check_palindrome;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String string = scanner.nextLine().toLowerCase();

        String[] wordArray = string.split("");
        for (String s : wordArray) {
            stack.push(s);
            queue.add(s);
        }

        boolean result = true;
        for (int i = 0; i < wordArray.length; i++) {
            if (!stack.pop().equals(queue.poll())) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("String is a Palindrome. ");
        } else {
            System.out.println("Not a Palindrome. ");
        }
    }
}
