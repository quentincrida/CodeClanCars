import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GearBoxTest {
    private GearBox gearBox;

    @Before
    public void before(){
        gearBox = new GearBox(6, "Manual");
    }

    @Test
    public void getNumberOfGears(){
        assertEquals(6, gearBox.getNumberOfGears());
    }

    @Test
    public void getTransmissionType(){
        assertEquals("Manual", gearBox.getTransmission());
    }



}
