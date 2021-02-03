import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> carsForSale;
    private String name;
    private String owner;
    private double till;

    public Dealership(String name, String owner, double till) {
        this.carsForSale = new ArrayList<>();
        this.name = name;
        this.owner = owner;
        this.till = till;
    }

    public ArrayList<Car> getCarsForSale() {
        return carsForSale;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public double getTill() {
        return till;
    }

    public void buyCar(Car car){
        if(till >= car.getPrice()){
            till -= car.getPrice();
            carsForSale.add(car);
        }
    }


}
