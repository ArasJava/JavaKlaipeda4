package home_works.HW20201228.Deliveries;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Courier courrier10 = new Courier(10);
        Courier courrier11 = new Courier(11);
        Courier courrier12 = new Courier(12);

        Gadget phone1 = new Gadget(GadgetType.PHONE, 220.60, courrier10);
        Gadget tv1 = new Gadget(GadgetType.TV, 120.60, courrier11);
        Gadget phone2 = new Gadget(GadgetType.PHONE, 520.60, courrier11);
        Gadget tv2 = new Gadget(GadgetType.TV, 320.60, courrier12);
        Gadget phone3 = new Gadget(GadgetType.PHONE, 1020.60, courrier11);
        Gadget tv3 = new Gadget(GadgetType.TV, 920.60, courrier10);

        List<Gadget> gadgetListPerson1 = new ArrayList<Gadget>();
        gadgetListPerson1.add(phone1);
        gadgetListPerson1.add(tv1);

        List<Gadget> gadgetListPerson2 = new ArrayList<Gadget>();
        gadgetListPerson2.add(phone2);
        gadgetListPerson2.add(tv2);

        List<Gadget> gadgetListPerson3 = new ArrayList<Gadget>();
        gadgetListPerson3.add(phone3);
        gadgetListPerson3.add(tv2);

        Person person1 = new Person("Jonas ", "Nemuno g.1 ", (ArrayList<Gadget>) gadgetListPerson1, 5);
        System.out.println(person1);
        if  (person1.getDeliverUntil() < courrier10.getDeliveryDate()
            && person1.getDeliverUntil() < courrier11.getDeliveryDate()
           && person1.getDeliverUntil() < courrier12.getDeliveryDate())
        {
            System.out.println("Jonas gavo siuntas laiku.");
        }

        Person person2 = new Person("Petras ", "Neries g.1  ", (ArrayList<Gadget>) gadgetListPerson2, 11);
        System.out.println(person2);
        if  (person2.getDeliverUntil() < courrier10.getDeliveryDate()
                && person2.getDeliverUntil() < courrier11.getDeliveryDate()
                && person2.getDeliverUntil() < courrier12.getDeliveryDate())
        {
            System.out.println("Petras gavo siuntalaiku");
        }
        Person person3 = new Person("Stasys ", "Nevezio g.1  ", (ArrayList<Gadget>) gadgetListPerson3, 15);
        System.out.println(person3);


    }
}
