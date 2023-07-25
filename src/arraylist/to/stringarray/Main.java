package arraylist.to.stringarray;
//Convert ArrayList to String Array


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Amit");
        list.add("Kunal");
        list.add("Saurab");
        list.add("Nikhil");
        list.add("Rushi");

        System.out.println("ArrayList : " + list);

        String[] string_array = new String[list.size() - 1];

        for (int i = 0; i < list.size() - 1; i++) {
            string_array[i] = list.get(i + 1);
        }

        System.out.println("string Array : " + Arrays.toString(string_array));

    }
}
