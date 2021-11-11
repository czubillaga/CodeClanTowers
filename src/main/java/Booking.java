import room.Bedroom;

public class Booking {

    private Bedroom bedroom;
    private int duration;

    public Booking(Bedroom bedroom, int duration) {
        this.bedroom = bedroom;
        this.duration = duration;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getDuration() {
        return this.duration;
    }

    public double getBill() {
        double rate = this.bedroom.getRoomType().getRate();
        return rate * this.duration;
    }
}
