package home_works.HW20201228.Company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class CompanyMain {
    public static void main(String[] args) {
        Device device1 = new Device(" ", 3000, 3, " ");
        Device device2 = new Device(" ", 2000, 3, " ");
        Device device3 = new Device(" ", 10000, 3, " ");
        Device device4 = new Device(" ", 5000, 3, " ");
        Device device5 = new Device(" ", 4000, 3, " ");
        Device device6 = new Device(" ", 7000, 3, " ");
        Device device7 = new Device(" ", 300000, 3, " ");
        Device device8 = new Device(" ", 250000, 3, " ");
        Device device9 = new Device(" ", 300, 3, " ");
        Device device10 = new Device(" ", 150, 3, " ");
        Device device11 = new Device(" ", 50, 3, " ");
        Device device12 = new Device(" ", 60, 3, " ");

        ArrayList<Device> techDevice1 = new ArrayList<>();
        techDevice1.add(device1);
        techDevice1.add(device2);
        techDevice1.add(device3);
        ArrayList<Device> techDevice2 = new ArrayList<>();
        techDevice2.add(device4);
        techDevice2.add(device5);
        techDevice2.add(device6);
        ArrayList<Device> techDevice3 = new ArrayList<>();
        techDevice3.add(device7);
        techDevice3.add(device8);
        ArrayList<Device> techDevice4 = new ArrayList<>();
        techDevice4.add(device9);
        techDevice4.add(device10);
        ArrayList<Device> techDevice5 = new ArrayList<>();
        techDevice5.add(device11);
        techDevice5.add(device12);

        Company company1 = new Company("Pirma kompanija", " ", ProductionType.TECHNOLOGIES, techDevice1);
        Company company2 = new Company("Antra kompanija", " ", ProductionType.TECHNOLOGIES, techDevice2);
        Company company3 = new Company("Trecia kompanija", " ", ProductionType.AUTOMOBILES, techDevice3);
        Company company4 = new Company("Ketvirta kompanija", " ", ProductionType.GARDEN_TOOLS, techDevice4);
        Company company5 = new Company("Penkta kompanija", " ", ProductionType.FOOD, techDevice5);

        ArrayList<Company> kompanija = new ArrayList<>();
        kompanija.add(company1);
        kompanija.add(company2);
        kompanija.add(company3);
        kompanija.add(company4);
        kompanija.add(company5);


        for (Company name : kompanija) {
            if (name.getProductionType() == ProductionType.TECHNOLOGIES) {
                System.out.println(name + " turi TECHNOLOGIES produktus");
            }
            int i = 0;
            Device max = name.getTecDevice().get(i);

            while (i < name.getTecDevice().size())  {
                if (max.getPrice() < name.getTecDevice().get(i).getPrice()) {
                    max = name.getTecDevice().get(i);
                }
                i++;
            }
            System.out.println("Brangiausias produktas kuri turi " + name + " kainuoja " + max);
        }
    }
}
