package home_works.HW20201228.Generic.TwoItems;

public class TwoItems<T> {
    private T entry;

    public TwoItems(T entry) {
        this.entry = entry;
    }

    public String toString() {
        return entry.toString();
    }
    public static void main(String[] args) {
        TwoItems<Integer> entry1 = new TwoItems<>(5);
        System.out.println(entry1);
        TwoItems<String> entry2 = new TwoItems<>("zodis");
        System.out.println(entry2);

    }
}
