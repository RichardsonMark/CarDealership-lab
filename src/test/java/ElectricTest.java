import behaviours.IPower;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ElectricTest {

    Electric electricCar;

    @Before
    public void before(){
        Electricity electric = new Electricity();
        ArrayList<IPower> fuel = new ArrayList<>();
        fuel.add(electric);
        electricCar = new Electric(fuel, 15000, "Blue", "Zappy900");
    }

    @Test
    public void electricCarExists() {
        assertNotNull(electricCar);
    }


    @Test
    public void canGetPrice() {
        assertEquals(15000, electricCar.getPrice());
    }

    @Test
    public void canGetColour() {
        assertEquals("Blue", electricCar.getColour());
    }

    @Test
    public void canGetModel() {
        assertEquals("Zappy900", electricCar.getModel());
    }
}
