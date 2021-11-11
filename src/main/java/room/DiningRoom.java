package room;

public class DiningRoom extends ConferenceRoom {

    public DiningRoom(int capacity, String roomName) {
        super(capacity, roomName);
        super.setAsDiningRoom();
    }



}
