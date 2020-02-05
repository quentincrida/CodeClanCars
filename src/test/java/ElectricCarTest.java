import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
     private ElectricCar electricCar;
     private Tyres tyres;
     private GearBox gearBox;
     private ElectricEngine electricEngine;

     @Before
    public void before(){
         tyres = new Tyres("Dunlop", "Sports");
         gearBox = new GearBox(2, "Automatic");
         electricEngine = new ElectricEngine();
         electricCar = new ElectricCar(10000, "Silver", 5, tyres, gearBox, electricEngine);
     }
     @Test
        public void getPrice(){
         assertEquals(10000, electricCar.getPrice(), 0.02);
     }
     @Test
        public void getColour(){
         assertEquals("Silver", electricCar.getColour());
     }
     @Test
        public void getNumberOfDoors(){
         assertEquals(5, electricCar.getNumberOfDoors());
     }
     @Test
        public void hasTyres(){
         assertEquals(tyres, electricCar.getTyres());
     }
     @Test
        public void hasGearBox(){
         assertEquals(gearBox, electricCar.getGearBox());
     }
    @Test
    public void hasElectricEngine(){
         assertEquals(electricEngine, electricCar.getEngine());
    }
}
