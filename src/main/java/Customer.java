import java.util.ArrayList;

public class Customer {

    private String name;
    private int money;
    private ArrayList<Car> garage;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
        this.garage = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Car> getGarage() {
        return garage;
    }

    public void buyCar(Car car){
        if(money >= car.getPrice()){
            money -= car.getPrice();
            garage.add(car);
        }
    }
}
