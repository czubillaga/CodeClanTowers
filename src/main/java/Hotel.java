import guest.Guest;
import room.Bedroom;
import room.ConferenceRoom;
import room.DiningRoom;
import room.Room;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Room> rooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel() {
        this.rooms = new ArrayList<Room>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
        if(room.isDiningRoom()) {
            DiningRoom diningRoom = (DiningRoom) room;
            diningRooms.put(diningRoom.getRoomName(), diningRoom);
        }
    }

    public int getRoomCount() {
        return this.rooms.size();
    }

    public void checkIn(Room room, Guest guest) {
        if(room.getGuestCount() == 0) {
            room.addGuest(guest);
        }
    }

    public Booking bookRoom(Bedroom bedroom, int duration) {
        bedroom.setBooked();
        Booking booking = new Booking(bedroom, duration);
        return booking;
    }

    public HashMap getDiningRooms() {
        return this.diningRooms;
    }

    public ArrayList getVacantRooms() {
        ArrayList vacantRooms = new ArrayList<Bedroom>();
        for(Room room: this.rooms) {
            if(!room.isBooked()) {
                vacantRooms.add(room);
            }
        }
        return vacantRooms;
    }
}
