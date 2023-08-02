import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Barry", "JK5438D", 10000, "Development");
    }


    @Test
    public void hasName(){
        assertEquals("Barry", manager.getName());
    }

    @Test
    public void hasNInumber(){
        assertEquals("JK5438D", manager.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(10000, manager.getSalary(), 0.0);
    }

    @Test
    public void hasReceivedRaise(){
        manager.raiseSalary(5000);
        assertEquals(15000, manager.getSalary(), 0.0);
    }

    @Test
    public void hasReceivedBonus(){
        manager.payBonus();
        assertEquals(10100, manager.payBonus(), 0.0);
    }
}
