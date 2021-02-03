import behaviours.IPower;

import java.util.ArrayList;

public class Petrol extends Car{

    private double engineSize;


    public Petrol(ArrayList<IPower> fuel, int price, String colour, String model, double engineSize) {
        super(fuel, price, colour, model);
        this.engineSize = engineSize;
    }

    public double getEngineSize() {
        return engineSize;
    }
}
