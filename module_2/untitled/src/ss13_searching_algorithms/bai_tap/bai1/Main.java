package ss13_searching_algorithms.bai_tap.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        ArrayList<Character> maxArray = new ArrayList<>();
        ArrayList<Character> tempArray = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            tempArray.clear();
            tempArray.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > tempArray.get(tempArray.size() - 1)) {
                    tempArray.add(string.charAt(j));
                }
            }
            if (maxArray.size() < tempArray.size()) {
                maxArray.clear();
                maxArray.addAll(tempArray);
            }
        }
        System.out.println(maxArray);
    }
}

