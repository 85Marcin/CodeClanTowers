package bookings;

import rooms.Bedroom;

public class Booking {
    private Bedroom bedroom;
    private int nightsBooked;

    public Booking(Bedroom bedroom, int nightsBooked){
        this.bedroom= bedroom;
        this.nightsBooked = nightsBooked;

    }
    public Bedroom getBedroom(){
        return this.bedroom;
    }
    public int getNightsBooked(){
        return this.nightsBooked;
    }
    public int calculateBill(){
        return this.nightsBooked * this.bedroom.getRoomTypeNightlyRate();
    }
}
