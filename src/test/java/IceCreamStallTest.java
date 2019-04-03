import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCream ice;

    @Before
    public void before(){
        ice = new IceCream("LOly","Walls","b1");

    }

    @Test
    public void canGetName(){
        assertEquals("LOly",ice.getName());
    }

    @Test
    public void canSetName(){
        ice.setName("CrayCray");
        assertEquals("CrayCray",ice.getName());
    }

    @Test
    public void canGetownerName(){
        assertEquals("Walls",ice.getOwnerName());
    }

    @Test
    public void canSetownerName(){
        ice.setOwnerName("CrayCray");
        assertEquals("CrayCray",ice.getOwnerName());
    }

    @Test
    public void canGetparkingSpot(){
        assertEquals("b1",ice.getParkingSpot());
    }

    @Test
    public void canSetparkingSpot(){
        ice.setParkingSpot("h3");
        assertEquals("h3",ice.getParkingSpot());
    }



}
