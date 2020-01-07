import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;
    private Bus bus;

    @Before
    public void before(){
        busStop = new BusStop("Leith");
        person = new Person();
        bus = new Bus("Ocean Terminal", 3);
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void addPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void removePersonFromTheQueue(){
        busStop.addPerson(person);
        busStop.removePerson(person);
        assertEquals(0, busStop.queueCount() );
    }

    @Test
    public void addPersonFromQueueToBus() {
        busStop.addPerson(person);
        bus.boardBus(busStop, person);
        assertEquals(0, busStop.queueCount());
        assertEquals(1, bus.countPassengers());
    }
}
