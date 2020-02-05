import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {
    private PetrolCar petrolCar;
    private Tyres tyres;
    private GearBox gearBox;
    private PetrolEngine petrolEngine;

    @Before
    public void before(){
        tyres = new Tyres("GoodYear", "Roadster");
        gearBox = new GearBox(2, "automatic");
        petrolEngine = new PetrolEngine();
        petrolCar = new PetrolCar(15000, "White", 3, tyres, gearBox, petrolEngine);
    }

    @Test
    public void getPrice(){
        assertEquals(15000, petrolCar.getPrice(), 0.01);
    }
    @Test
    public void getColour(){
        assertEquals("White", petrolCar.getColour());
    }
    @Test
    public void getNumberOfDoors(){
        assertEquals(3, petrolCar.getNumberOfDoors());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres, petrolCar.getTyres() );
    }
    @Test
    public void gearBoxType() {
        assertEquals(gearBox, petrolCar.getGearBox());
    }
    @Test
    public void hasPetrolEngine(){
        assertEquals(petrolEngine, petrolCar.getEngine());
    }
}
