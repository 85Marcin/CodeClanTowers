package hotelsTests;

import bookings.Booking;
import guests.Guest;
import hotels.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(14, RoomType.DOUBLE );
        conferenceRoom = new ConferenceRoom(100, "E62");
        guest1 = new Guest ("Sally");





    }
    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }
    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }
    @Test
    public void canAddGuest(){
        hotel.addBedroom(bedroom);
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.getNumberOfGuest());

    }
    @Test
    public void canBookRoom(){
        Booking booking = hotel.bookRoom(bedroom, 3);
        assertEquals(Booking.class , booking.getClass());
    }


}
