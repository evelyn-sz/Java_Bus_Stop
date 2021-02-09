import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus1;
    private Passenger bob;
    private Passenger lisa;
    private Passenger lucy;

    @Before
    public void before(){
        bus1 = new Bus("Tranent", 2);
        bob = new Passenger("Bob");
        lisa = new Passenger("Lisa");
        lucy = new Passenger("Lucy");

    }

    @Test
    public void hasDestination(){
        assertEquals("Tranent", bus1.getDestination());
    }

    @Test
    public void checkBusStartsEmpty(){
        assertEquals(0, bus1.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus1.addPassenger(bob);
        bus1.addPassenger(lisa);
        bus1.addPassenger(lucy);
        assertEquals(2, bus1.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus1.addPassenger(bob);
        bus1.addPassenger(lisa);
        bus1.removePassenger(lisa);
        assertEquals(1, bus1.passengerCount());
    }

}
