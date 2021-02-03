import behaviours.IPower;

import java.util.ArrayList;

public class Electric extends Car {

    private int batteryCapacity;

    public Electric(ArrayList<IPower> fuel, int price, String colour, String model) {
        super(fuel, price, colour, model);
    }
}
