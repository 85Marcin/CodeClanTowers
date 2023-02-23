package bookingsTest;

import bookings.Booking;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom;
    Booking booking;


    @Before
    public void before(){
        bedroom = new Bedroom(11, RoomType.DOUBLE);
        booking = new Booking(bedroom, 2);
    }
    @Test
    public void canGetBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }
    @Test
    public void canGetNumberOfNights(){
        assertEquals(2, booking.getNightsBooked());
    }
    @Test
    public void canCalculateBill(){
        assertEquals(40, booking.calculateBill());
    }
}
