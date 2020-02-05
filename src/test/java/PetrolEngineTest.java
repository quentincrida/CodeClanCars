import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PetrolEngineTest {
    private PetrolEngine petrolEngine;

    @Before
    public void before(){
        petrolEngine = new PetrolEngine();
    }

    @Test
    public void getType(){
        assertEquals("petrol",petrolEngine.getType());
    }
}
