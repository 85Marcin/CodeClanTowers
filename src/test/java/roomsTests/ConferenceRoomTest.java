package roomsTests;

import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before (){
        conferenceRoom = new ConferenceRoom(10, "CodeClan");

    }
    @Test
    public void canGetCapacity (){
        assertEquals(10, (int)conferenceRoom.getCapacity());

    }
    @Test
    public void canGetName(){
        assertEquals("CodeClan", conferenceRoom.getName());
    }
    @Test
    public void canGetGuestList(){
        assertEquals(0, conferenceRoom.getNumberOfGuest());
    }
}
