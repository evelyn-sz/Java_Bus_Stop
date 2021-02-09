import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus1;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
        bus1 = new Bus("Tranent", 30);
        passenger1 = new Passenger("Bob");
        passenger2 = new Passenger("Lisa");

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
        bus1.addPassenger(passenger1);
        bus1.addPassenger(passenger2);
        assertEquals(2, bus1.passengerCount());
    }

}
