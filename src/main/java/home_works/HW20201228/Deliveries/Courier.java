package home_works.HW20201228.Deliveries;

public class Courier {
    private String name;
    private String deliveryFrom;
    private int deliveryDate;

    public Courier(int deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getDeliveryDate() {
        return deliveryDate;
    }
    public String toString() {
        return String.valueOf(deliveryDate);
    }
}
