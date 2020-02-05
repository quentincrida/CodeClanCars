import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;
    private ElectricCar electricCar;
    private Tyres tyres;
    private GearBox gearBox;
    private ElectricEngine electricEngine;

    @Before
    public void before(){
        customer = new Customer("John Lennie", 30000);
        tyres = new Tyres("Dunlop", "Sports");
        gearBox = new GearBox(2, "Automatic");
        electricEngine = new ElectricEngine();
        electricCar = new ElectricCar(10000, "Silver", 5, tyres, gearBox, electricEngine);
    }
    @Test
    public void getName(){
        assertEquals("John Lennie", customer.getName());
    }
    @Test
    public void getMoney(){
        assertEquals(30000, customer.getMoney(), 0.01);
    }
    @Test
    public void shouldHaveZeroStock(){
        assertEquals(0, customer.countCarCollection());
    }
    @Test
    public void canAddCarToStock(){
        customer.addCarToCollection(electricCar);
        assertEquals(1, customer.countCarCollection());
    }
}
