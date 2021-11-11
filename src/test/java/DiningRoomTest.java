import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.ConferenceRoom;
import room.DiningRoom;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before() {
        diningRoom = new DiningRoom(50, "Dining Room 1");
    }

    @Test
    public void canGetCapacity()  {
        assertEquals(50, diningRoom.getRoomCapacity());
    }

    @Test
    public void canGetRoomName() {
        assertEquals("Dining Room 1", diningRoom.getRoomName());
    }

    @Test
    public void hasGuestCollection() {
        Guest guest = new Guest("Neil Hanlon");
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getGuestCount());
    }

}
