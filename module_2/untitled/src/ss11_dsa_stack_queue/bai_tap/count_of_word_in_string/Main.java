package ss11_dsa_stack_queue.bai_tap.count_of_word_in_string;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String string = scanner.nextLine().toLowerCase();
        String[] wordArray = string.split("");
        int count;
        for (String s : wordArray) {
            if (treeMap.containsKey(s)) {
                count = treeMap.get(s) + 1;
                treeMap.put(s, count);
            } else {
                treeMap.put(s, 1);
            }
        }
        System.out.println(treeMap);
    }
}
