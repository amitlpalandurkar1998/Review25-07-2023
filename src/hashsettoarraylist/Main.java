package hashsettoarraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//Convert HashSet to ArrayList in java

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        List<Integer> arrayList = new ArrayList<>(hashSet);


        System.out.println("hashSet : " + hashSet);
        System.out.println("arrayList : " + arrayList);
    }
}
