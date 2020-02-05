import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TyresTest {
    private Tyres tyres;

    @Before
    public void  before(){
        tyres = new Tyres("Dunlop", "Sports");
    }

    @Test
    public void getMake(){
        assertEquals("Dunlop", tyres.getMake());
    }
    @Test
    public void getType(){
        assertEquals("Sports", tyres.getType());
    }
}
