package guestsTests;

import guests.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

   Guest guest;

   @Before
    public void before(){
       guest = new Guest("Steve");

   }
   @Test
    public void canGetName(){
       assertEquals("Steve", guest.getName());
   }
   @Test
    public void canGetCheckedInStatus(){
       assertEquals(false, guest.getCheckedInStatus());
   }
   @Test
    public void canSetCheckedInStatus(){
       guest.setCheckedInStatus(true);
       assertEquals(true, guest.getCheckedInStatus());
   }

}
