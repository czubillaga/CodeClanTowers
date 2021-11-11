import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.ConferenceRoom;
import room.DiningRoom;
import room.RoomType;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Guest guest2;
    DiningRoom diningRoom;
    Bedroom bedroom2;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(RoomType.DOUBLE.getCapacity(), 213, RoomType.DOUBLE);
        bedroom2 = new Bedroom(RoomType.DOUBLE.getCapacity(), 214, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom(50, "Conference Room 1");
        guest = new Guest("Neil Hanlon");
        guest2 = new Guest("Carlos Zubillaga");
        diningRoom = new DiningRoom(50, "Dining Room 1");
    }

    @Test
    public void canAddBedroom() {
        hotel.addRoom(bedroom);
        assertEquals(1, hotel.getRoomCount());
    }

//    @Test
//    public void canAddConferenceRoom() {
//        hotel.addConRoom(conferenceRoom);
//        assertEquals(1, hotel.getConferenceRoomCount());
//    }

    @Test
    public void canCheckInGuests() {
        hotel.checkIn(bedroom, guest);
        assertEquals(1, bedroom.getGuestCount());
    }

    @Test
    public void canCreateBooking() {
        assertEquals(4, hotel.bookRoom(bedroom, 4).getDuration());
    }

    @Test
    public void hasDiningRoomHash() {
        hotel.addRoom(diningRoom);
        assertEquals(1, hotel.getDiningRooms().size());
    }

    @Test
    public void canReturnVacantRooms() {
        hotel.addRoom(bedroom);
        hotel.addRoom(bedroom2);
        hotel.bookRoom(bedroom, 4);
        assertEquals(1, hotel.getVacantRooms().size());
    }

    @Test
    public void willNotCheckIntoOccupiedRooms() {
        hotel.addRoom(bedroom);
        hotel.checkIn(bedroom, guest);
        hotel.checkIn(bedroom, guest2);
        assertEquals(1, bedroom.getGuestCount());
    }

}
