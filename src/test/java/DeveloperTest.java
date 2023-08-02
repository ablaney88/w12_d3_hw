import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Carry", "JK5438D", 8000);
    }


    @Test
    public void hasName(){
        assertEquals("Carry", developer.getName());
    }

    @Test
    public void hasNInumber(){
        assertEquals("JK5438D", developer.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(8000, developer.getSalary(), 0.0);
    }

    @Test
    public void hasReceivedRaise(){
        developer.raiseSalary(2000);
        assertEquals(10000, developer.getSalary(), 0.0);
    }

    @Test
    public void hasReceivedBonus(){
        developer.payBonus();
        assertEquals(8080, developer.payBonus(), 0.0);
    }
}
