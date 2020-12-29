package home_works.HW20201228.Generic.TwoItems;

import java.util.ArrayList;

public class TwoItems2<T> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T i) {
        list.add(i);
    }

    public ArrayList<T> getList() {
        return list;
    }

    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        TwoItems2<Integer> entry1 = new TwoItems2<>();
        TwoItems2<String> entry2 = new TwoItems2<>();
        for (int i = 1; i < 10; i++) {
            entry1.add(i);
        }
        String zodis = "zodis";
        for (int j = 1; j < 10; j++) {
            entry2.add(zodis + j);
        }
        System.out.println("Paduodami sarasai:");
        System.out.println(entry1);
        System.out.println(entry2);
        System.out.println("Paskutines saraso reiksmes:");
        int lastEntry1 = entry1.getList().size() - 1;
        int lastEntry2 = entry2.getList().size() - 1;
        System.out.println(entry1.getList().get(lastEntry1));
        System.out.println(entry2.getList().get(lastEntry2));
    }
}
