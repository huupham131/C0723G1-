package ss11_dsa_stack_queue.bai_tap.reverse.array;


import java.util.Arrays;
import java.util.Stack;

public class ArrayStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        int[] array = {2, 4, 6, 3, 8, 9};
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]= stack.pop();
        }
        System.out.println(Arrays.toString(newArray));
    }
}
