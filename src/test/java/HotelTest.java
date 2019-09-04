import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Room room1;
    private Room room2;
    private Room room3;

    private Guest guest1;
    private Guest guest2;

    private Booking booking1;
    private Booking booking2;

    private Hotel hotel;


    @Before
    public void setUp(){
        room1 = new Room(1, 2, "double");
        room2 = new Room(2, 1, "single");
        room3 = new Room(3, 2, "double");

        guest1 = new Guest("Jim Jones");
        guest2 = new Guest("Sue Smith");

        hotel = new Hotel("The Splendide");
    }

    @Test
    public void canAddRoomToHotelCollection(){
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        assertEquals(3, hotel.roomCount());
    }


    @Test
    public void canAddGuestToRoom(){
        hotel.addGuestToRoom(guest1, room1);
        assertEquals(1, room1.checkNumberOfGuestsInRoom());

    }

    @Test
    public void canCheckOut(){
        hotel.addRoom(room1);
        hotel.addGuestToRoom(guest1, room1);
        hotel.checkoutRoom(room1);
        assertEquals(0, room1.checkNumberOfGuestsInRoom());
    }

    @Test
    public void checkBookRoom(){
        Booking booking = hotel.bookRoom(room2, 7);
        assertEquals(2, booking.roomNumber());
    }
}