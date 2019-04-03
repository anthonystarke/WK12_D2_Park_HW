import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodge;

    @Before
    public void before(){
        dodge = new Dodgems("Blaster");
    }

    @Test
    public void canGetName(){
        assertEquals("Blaster",dodge.getName());
    }

    @Test
    public void canSetName(){
        dodge.setName("CrayCray");
        assertEquals("CrayCray",dodge.getName());
    }



}
