import org.junit.Before;

public class PassengerTest {
    public Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Bob");
    }
}
