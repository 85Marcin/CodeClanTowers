package rooms;

public class ConferenceRoom extends Room {
    private String name;

    public ConferenceRoom (Integer capacity, String name){
        super(capacity);
        this.name = name;

    }

    public String getName(){
        return this.name;
    }


}
