import behaviours.IPower;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void canBuyCar() {
        Customer dave = new Customer("Dave", 10000);
        Conventional petrol = new Conventional();
        ArrayList<IPower> fuel = new ArrayList<>();
        fuel.add(petrol);
        Petrol petrolCar = new Petrol(fuel, 8000, "Red", "B52", 2.8);
        dave.buyCar(petrolCar);
        assertEquals(1, dave.getGarage().size());
        assertEquals(2000, dave.getMoney());
    }
}
