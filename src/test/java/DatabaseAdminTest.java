import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Parry", "JK5438D", 7000);
    }


    @Test
    public void hasName(){
        assertEquals("Parry", databaseAdmin.getName());
    }

    @Test
    public void hasNInumber(){
        assertEquals("JK5438D", databaseAdmin.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(7000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void hasReceivedRaise(){
        databaseAdmin.raiseSalary(2000);
        assertEquals(9000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void hasReceivedBonus(){
        databaseAdmin.payBonus();
        assertEquals(7070, databaseAdmin.payBonus(), 0.0);
    }
}
