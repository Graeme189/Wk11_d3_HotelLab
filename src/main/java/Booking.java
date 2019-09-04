public class Booking {

    private Room room;
    private int numberOfNights;

    public Booking(Room room, int numberOfNights) {
        this.room = room;
        this.numberOfNights = numberOfNights;
    }

    public int roomNumber(){
        return this.room.getRoomNumber();
    }
}
