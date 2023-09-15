package ss10_dsa_danhsach.bai_tap.bai1;


import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
        listInteger.add(2, 2);
        System.out.println(Arrays.toString(listInteger.clone()));
        System.out.println(listInteger.contains(4));
    }
}
