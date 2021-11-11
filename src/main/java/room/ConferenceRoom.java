package room;

public class ConferenceRoom extends Room {
    private String roomName;

    public ConferenceRoom(int capacity, String roomName) {
        super(capacity);
        this.roomName = roomName;
    }

    public String getRoomName() {
        return this.roomName;
    }
}
