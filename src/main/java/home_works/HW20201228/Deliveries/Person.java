package home_works.HW20201228.Deliveries;

import java.util.ArrayList;

public class Person {
    private String name;
    private String deliveryAddress;
    private ArrayList <Gadget> gadget;
    protected int deliverUntil;

    public Person(String name, String deliveryAddress, ArrayList<Gadget> gadget, int deliverUntil) {
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.gadget = gadget;
        this.deliverUntil = deliverUntil;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<Gadget> getGadget() {
        return gadget;
    }

    public int getDeliverUntil() {
        return deliverUntil;
    }

    public String toString() {
        return name + deliveryAddress + gadget + deliverUntil;
    }
}
