import behaviours.IPower;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    @Test
    public void canBuyCar() {
        Dealership shop = new Dealership("Cars R US", "Swiss Tony", 20000);
        Conventional petrol = new Conventional();
        ArrayList<IPower> fuel = new ArrayList<>();
        fuel.add(petrol);
        Petrol petrolCar = new Petrol(fuel, 8000, "Red", "B52", 2.8);
        shop.buyCar(petrolCar);
        assertEquals(1, shop.getCarsForSale().size());
        assertEquals(12000, shop.getTill(), 0);
    }
}
