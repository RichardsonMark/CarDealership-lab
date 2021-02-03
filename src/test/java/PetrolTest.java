import behaviours.IPower;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PetrolTest {

    Petrol petrolCar;
    Conventional petrol;

    @Before
    public void before(){
        Conventional petrol = new Conventional();
        ArrayList<IPower> fuel = new ArrayList<>();
        fuel.add(petrol);
        petrolCar = new Petrol(fuel, 8000, "Red", "B52", 2.8);
    }

    @Test
    public void petrolCarExists() {
        assertNotNull(petrolCar);
    }

    @Test
    public void canGetEngineSize() {
        assertEquals(2.8, petrolCar.getEngineSize(),0);
    }

    @Test
    public void canGetPrice() {
        assertEquals(8000, petrolCar.getPrice());
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", petrolCar.getColour());
    }

    @Test
    public void canGetModel() {
        assertEquals("B52", petrolCar.getModel());
    }

//    @Test
//    public void canGetFuel() {
//        Conventional petrol = new Conventional();
//        ArrayList<IPower> fuel = new ArrayList<>();
//        fuel.add(petrol);
//        Petrol petrolCar1 = new Petrol(fuel, 3, "Red", "Ti", 2);
//        assertEquals({petrol}, petrolCar1.getFuel());
//
//    }
}
