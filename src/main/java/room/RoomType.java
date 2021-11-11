package room;

public enum RoomType {

    SINGLE(1, 20.00),
    DOUBLE(2, 30.00),
    TRIPLE(3, 40.00),
    FAMILY(4, 50.00);

    private final int capacity;
    private final double rate;

    RoomType(int capacity, double rate) {
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getRate() {
        return this.rate;
    }
}
