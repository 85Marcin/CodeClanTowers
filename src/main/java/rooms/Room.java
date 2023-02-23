package rooms;

import guests.Guest;

import java.util.ArrayList;

public abstract class Room {
    private Integer capacity;
    private ArrayList<Guest> guests;


    public Room(Integer capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }
    public Integer getCapacity(){
        return  this.capacity;
    }
    public ArrayList<Guest> getGuestsList(){
        return this.guests;
    }
    public void addGuest(Guest guest){
        this.guests.add(guest);
    }
    public int getNumberOfGuest (){
        return this.guests.size();
    }
   public void removeGuest(Guest guest){
        this.guests.remove(guest);
   }
}
