import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private Hotel hotel;
    private Guest guest;

    @Before
    public void before(){

        room = new Room(1, 2, "double");
        guest = new Guest("Mike Thwaites");
    }

    @Test
    public void hasNumber(){
        assertEquals(1, room.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("double", room.getType());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, room.checkNumberOfGuestsInRoom());
    }

    @Test
    public void canAddGuestToRoom() {
        room.addGuest(guest);
        assertEquals(1, room.checkNumberOfGuestsInRoom());
    }

}