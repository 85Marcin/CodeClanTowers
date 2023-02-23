package hotels;

import bookings.Booking;
import rooms.Bedroom;
import rooms.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;


    public Hotel (){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int getNumberOfBedrooms(){
        return this.bedrooms.size();
    }
    public int getNumberOfConferenceRooms(){
        return this.conferenceRooms.size();
    }
    public ArrayList<Bedroom> getBedroomList(){
        return this.bedrooms;
    }
    public ArrayList<ConferenceRoom> getConferenceRoomList(){
        return this.conferenceRooms;
    }
    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }
    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        return new Booking(bedroom, numberOfNights);
    }

}
