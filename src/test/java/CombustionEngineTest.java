import behaviours.IPower;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CombustionEngineTest {

    CombustionEngine combustionEngine;

    @Before
    public void before(){
        combustionEngine = new CombustionEngine();
        Conventional petrol = new Conventional();
        ArrayList<IPower> fuel = new ArrayList<>();
        fuel.add(petrol);
        Petrol petrolCar = new Petrol(fuel, 8000, "Red", "B52", 2.8);
    }

    @Test
    public void canCombust(){
        assertEquals("Petrol (liquified carbon)! Makes car go zoom", combustionEngine.run());
    }





}
