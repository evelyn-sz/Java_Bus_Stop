import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private Bus bus1;
    private BusStop busStop;
    private Passenger bob;
    private Passenger lisa;
    private Passenger lucy;

    @Before
    public void before(){
        bus1 = new Bus("Tranent", 2);
        busStop = new BusStop("Edinburgh");
        bob = new Passenger("Bob");
        lisa = new Passenger("Lisa");
        lucy = new Passenger("Lucy");
    }

    @Test
    public void hasName(){
        assertEquals("Edinburgh", busStop.getName());
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.queueSize());
    }

    @Test
    public void canAddPassengerToQueue(){
        busStop.addToQueue(bob);
        busStop.addToQueue(lisa);
        assertEquals(2, busStop.queueSize());
    }

    @Test
    public void canRemovePassengerFromQueue(){
        busStop.addToQueue(bob);
        busStop.addToQueue(lisa);
        busStop.addToQueue(lucy);
        busStop.removeFromQueue();
        assertEquals(2, busStop.queueSize());

    }
}
