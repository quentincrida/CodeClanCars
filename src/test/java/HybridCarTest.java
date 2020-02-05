import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

   private HybridCar hybridCar;
   private Tyres tyres;
   private GearBox gearBox;
   private HybridEngine hybridEngine;

   @Before
    public void before(){
       hybridCar = new HybridCar(20000, "Green", 5, tyres, gearBox, hybridEngine );
   }
   @Test
    public void getPrice(){
       assertEquals(20000, hybridCar.getPrice(), 0.01);
   }
   @Test
   public void getColour(){
       assertEquals("Green", hybridCar.getColour());
   }
   @Test
    public void getNumberOfDoors(){
       assertEquals(5, hybridCar.getNumberOfDoors());
   }
   @Test
   public void hasTyres() {
       assertEquals(tyres, hybridCar.getTyres());
   }
   @Test
    public void hasEngine(){
       assertEquals(hybridEngine, hybridCar.getEngine());
   }

}
