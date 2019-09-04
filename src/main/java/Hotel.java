import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Room> roomCollection;

    public Hotel(String name) {
        this.name = name;
        this.roomCollection = new ArrayList<Room>();
    }

    public void addRoom(Room room) {
        this.roomCollection.add(room);
    }

    public int roomCount() {
        return this.roomCollection.size();
    }

    public void addGuestToRoom(Guest guest, Room room) {
        room.addGuest(guest);
    }

//    public void checkoutGuestFromRoom(Guest guest, Room room) {
//        room.removeGuest(guest);
//    }

    public void checkoutRoom(Room room) {
        room.clearRoom();
    }

    public Booking bookRoom(Room room, int numberOfNights) {
         Booking booking = new Booking(room, numberOfNights);
         return booking;
    }

}
