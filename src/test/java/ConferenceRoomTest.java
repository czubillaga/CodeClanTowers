import org.junit.Before;
import org.junit.Test;
import room.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(50, "Conference Room 1");
    }

    @Test
    public void canGetCapacity()  {
        assertEquals(50, conferenceRoom.getRoomCapacity());
    }

    @Test
    public void canGetRoomName() {
        assertEquals("Conference Room 1", conferenceRoom.getRoomName());
    }
}
