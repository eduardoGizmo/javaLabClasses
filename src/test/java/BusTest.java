import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Ocean Terminal", 3);
        person = new Person();
    }

    @Test
    public void busStartEmpty(){
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.countPassengers());
    }

    @Test
    public void busIsFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3 , bus.countPassengers());
    }

    @Test
    public void shouldRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.countPassengers());
    }
}
