import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Barry", "JK5438D", 10000, "Development", 2000);
    }


    @Test
    public void hasName(){
        assertEquals("Barry", director.getName());
    }

    @Test
    public void hasNInumber(){
        assertEquals("JK5438D", director.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(10000, director.getSalary(), 0.0);
    }

    @Test
    public void hasReceivedRaise(){
        director.raiseSalary(5000);
        assertEquals(15000, director.getSalary(), 0.0);
    }

    @Test
    public void hasReceivedBonus(){
        director.payBonus();
        assertEquals(10100, director.payBonus(), 0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(2000, director.getBudget(), 0.0);
    }
}
