import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor1;

    @Before
    public void before(){
        visitor1 = new Visitor(12,100,20);
    }

    @Test
    public void canGetAge(){
        assertEquals(12,visitor1.getAge());
    }

    @Test
    public void canSetAge(){
        visitor1.setAge(10);
        assertEquals(10,visitor1.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(100,visitor1.getHeight());
    }

    @Test
    public void canSetHeight(){
        visitor1.setHeight(120);
        assertEquals(120,visitor1.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(20,visitor1.getMoney());
    }

    @Test
    public void canSetMoney(){
        visitor1.setMoney(30);
        assertEquals(30,visitor1.getMoney());
    }
}
