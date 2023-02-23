package roomsTests;

import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;


    @Before
    public void before(){
        bedroom = new Bedroom(13, RoomType.SINGLE);
        guest = new Guest("Dave");
    }
    @Test
    public void canGetCapacity(){
        assertEquals(1, (int)bedroom.getRoomTypeCapacity());
    }
    @Test
    public void canGetRoomNb(){
        assertEquals(13, bedroom.getRoomNb());
    }
    @Test
    public void canGetNumberOfGuestList(){
        assertEquals(0, bedroom.getNumberOfGuest());
    }
    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }
    @Test
    public void canGetGuestList(){
        assertEquals(true,bedroom.getGuestsList().isEmpty());
    }
    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuest());
    }
    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getNumberOfGuest());
    }
    @Test
    public void canGetRoomTypeNightlyRate(){
        assertEquals(15, (int)bedroom.getRoomTypeNightlyRate());
    }
}
