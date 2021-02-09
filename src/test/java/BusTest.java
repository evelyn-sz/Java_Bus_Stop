import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BusTest {
    private Bus bus1;
    private BusStop edinburgh;
    private Passenger bob;
    private Passenger lisa;
    private Passenger lucy;

    @Before
    public void before(){
        bus1 = new Bus("Tranent", 2);
        edinburgh = new BusStop("Edinburgh");
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
        assertFalse(bus1.getPassengers().contains(lisa));
        assertEquals(1, bus1.passengerCount());
    }

    @Test
    public void canPickUpFromBusStop(){
        bus1.addPassenger(lisa);
        bus1.pickUpFromBusStop(edinburgh);
        assertEquals(1, bus1.passengerCount());
        assertEquals(0, edinburgh.queueSize());
    }
}
