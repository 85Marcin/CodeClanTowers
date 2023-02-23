package rooms;

public enum RoomType {
    SINGLE(1, 15),
    DOUBLE(2, 20),
    FAMILY(4, 25);


    private final Integer capacity;
    private final Integer nightlyRate;


    RoomType(Integer capacity, Integer nightlyRate){
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
    }

    public Integer getCapacity(){
        return this.capacity;
    }

    public Integer getNightlyRate(){
        return this.nightlyRate;
    }
}

