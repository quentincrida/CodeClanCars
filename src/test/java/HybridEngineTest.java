import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HybridEngineTest {
    private HybridEngine hybridEngine;

    @Before
    public void before(){
        hybridEngine = new HybridEngine();
    }

    @Test
    public void getType(){
        assertEquals("hybrid", hybridEngine.getType());
    }

}
