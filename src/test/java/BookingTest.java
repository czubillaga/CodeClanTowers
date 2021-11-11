import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.RoomType;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.DOUBLE.getCapacity(), 213, RoomType.DOUBLE);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void hasRoom() {
        assertEquals(RoomType.DOUBLE, booking.getBedroom().getRoomType());
    }

    @Test
    public void hasDuration() {
        assertEquals(3, booking.getDuration());
    }

    @Test
    public void canCalculateBill() {
        assertEquals(90.00, booking.getBill(), 0.0);
    }
}
