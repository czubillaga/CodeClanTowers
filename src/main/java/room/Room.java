package room;


import guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;
    private boolean isDiningRoom;
    private boolean booked;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.isDiningRoom = false;
        this.booked = false;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public int getRoomCapacity() {
        return this.capacity;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public void setAsDiningRoom() {
        this.isDiningRoom = true;
    }

    public boolean isDiningRoom() {
        return this.isDiningRoom;
    }

    public void setBooked() {
        this.booked = true;
    }

    public boolean isBooked() {
        return this.booked;
    }


}
