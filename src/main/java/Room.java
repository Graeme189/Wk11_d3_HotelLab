import java.util.ArrayList;

public class Room {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> roomGuestsCollection;
//    private Guest guest;

    public Room(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.roomGuestsCollection = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public String getType() {
        return this.type;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int checkNumberOfGuestsInRoom() {
        return this.roomGuestsCollection.size();
    }

    public void addGuest(Guest guest){
        this.roomGuestsCollection.add(guest);
    }

    public void clearRoom(){
        this.roomGuestsCollection.clear();
    }





}
