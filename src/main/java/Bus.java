import java.nio.charset.Charset;
import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengerList;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengerList = new ArrayList<Passenger>();
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengerList;
    }

    public String getDestination() {
        return this.destination;
    }

    public int passengerCount() {
        return this.passengerList.size();
    }

    public void addPassenger(Passenger passenger) {
        if (passengerCount() < this.capacity)
            this.passengerList.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        this.passengerList.remove(passenger);
    }

    public void pickUpFromBusStop(BusStop busStop) {
        if(this.passengerCount() < this.capacity && busStop.queueSize() > 0){
            Passenger passengerRemoved = busStop.removeFromQueue();
            this.addPassenger(passengerRemoved);
        }
    }
}