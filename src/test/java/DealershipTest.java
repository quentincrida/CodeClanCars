import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    private Dealership dealership;
    private ElectricCar electricCar;
    private Tyres tyres;
    private GearBox gearBox;
    private ElectricEngine electricEngine;

    @Before
    public void before(){
        dealership = new Dealership();
        tyres = new Tyres("Dunlop", "Sports");
        gearBox = new GearBox(2, "Automatic");
        electricEngine = new ElectricEngine();
        electricCar = new ElectricCar(10000, "Silver", 5, tyres, gearBox, electricEngine);
    }

    @Test
    public void checkTillEmpty(){
        assertEquals(0, dealership.getTill(), 0.02);
    }
    @Test
    public void checkStockEmpty(){
        assertEquals(0, dealership.countCars());
    }
    @Test
    public void canAddCarToStock(){
        dealership.addCarToStock(electricCar);
        assertEquals(1, dealership.countCars());
    }
}
