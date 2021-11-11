import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.DOUBLE.getCapacity(), 213, RoomType.DOUBLE);
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(2, bedroom.getRoomCapacity());
    }

    @Test
    public void roomHasNightlyRate() {
        assertEquals(30.00, bedroom.getRoomType().getRate(), 0.0);
    }
}
