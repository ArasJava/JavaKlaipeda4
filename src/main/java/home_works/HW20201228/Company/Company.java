package home_works.HW20201228.Company;

import java.util.ArrayList;

public class Company {
    private String name;
    private String address;
    ProductionType productionType;
    private ArrayList<Device> tecDevice;

    public Company (String name, String address, ProductionType productionType, ArrayList<Device> tecDevice) {
        this.name = name;
        this.address = address;
        this.productionType = productionType;
        this.tecDevice = tecDevice;
    }

    public ProductionType getProductionType() {
        return productionType;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Device> getTecDevice() {
        return tecDevice;
    }

    public String toString () {
        return String.valueOf(name);
    }
}
