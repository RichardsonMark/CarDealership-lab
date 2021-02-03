import behaviours.IPower;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HybridTest {

    Hybrid hybridCar;

    @Before
    public void before(){
        Conventional petrol = new Conventional();
        Electricity electric = new Electricity();
        ArrayList<IPower> fuel = new ArrayList<>();
        fuel.add(petrol);
        fuel.add(electric);
        hybridCar = new Hybrid(fuel, 20000, "Red", "NOT Water Powered");
    }

    @Test
    public void hybridCarExists() {
        assertNotNull(hybridCar);
    }


    @Test
    public void canGetPrice() {
        assertEquals(20000, hybridCar.getPrice());
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", hybridCar.getColour());
    }

    @Test
    public void canGetModel() {
        assertEquals("NOT Water Powered", hybridCar.getModel());
    }
}
