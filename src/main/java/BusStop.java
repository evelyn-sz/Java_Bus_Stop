import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Passenger> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Passenger>();
    }

    public String getName() {
        return this.name;
    }

    public int queueSize() {
        return this.queue.size();
    }

    public void addToQueue(Passenger passenger) {
        this.queue.add(passenger);
    }

    public Passenger removeFromQueue() {
        Passenger passengerRemoved = null;
        if (this.queueSize() > 0) {
            passengerRemoved = this.queue.remove(0);
        }
            return passengerRemoved;
    }
}
