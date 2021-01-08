package home_works.HW20201228.Company;

public class Device {
    private String name;
    private int price;
    private int quantity;
    private String description;

    public Device(String name,int price, int quantity, String description ) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
    public int getPrice() {
        return price;
    }

    public String toString() {
        return String.valueOf(price);
    }
}
