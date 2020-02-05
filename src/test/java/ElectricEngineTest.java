import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ElectricEngineTest {

    private ElectricEngine electricEngine;


    @Before
    public void before(){
        electricEngine = new ElectricEngine();
        }

        @Test
    public void getType(){
        assertEquals("electric", electricEngine.getType());
        }

    }


