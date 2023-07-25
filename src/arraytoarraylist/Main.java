package arraytoarraylist;
//Convert Array to ArrayList
//Convert Uppercase to Lowercase in java without using built in method?

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> list = new ArrayList<>();

        int count = 0;
        for (int i = 1; i <= arr.length; i++) {
            list.add(i);
        }

        System.out.print("Array to Array List : ");
        for (int print : list) {
            System.out.print(print + ",");
        }
    }
}
