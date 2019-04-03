import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("CrazySnake");
    }

    @Test
    public void canGetName(){
        assertEquals("CrazySnake",rollercoaster.getName());
    }

    @Test
    public void canSetName(){
        rollercoaster.setName("CrayCray");
        assertEquals("CrayCray",rollercoaster.getName());
    }


}
