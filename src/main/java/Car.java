import behaviours.IPower;

import java.util.ArrayList;

public abstract class Car {

    private ArrayList<IPower> fuel;
    private int price;
    private String colour;
    private String model;

    public Car(ArrayList<IPower> fuel, int price, String colour, String model) {
        this.fuel = fuel;
        this.price = price;
        this.colour = colour;
        this.model = model;
    }

    public ArrayList<IPower> getFuel() {
        return fuel;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }
}
