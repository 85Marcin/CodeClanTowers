package rooms;

public class Bedroom extends Room {

    private int roomNb;

    private RoomType roomType;

    public Bedroom(int roomNb, RoomType roomType){
        super(roomType.getCapacity());
        this.roomNb= roomNb;
        this.roomType = roomType;

    }

    public int getRoomNb(){
        return this.roomNb;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public Integer getRoomTypeCapacity(){
        return this.roomType.getCapacity();
    }
    public Integer getRoomTypeNightlyRate(){
        return this.roomType.getNightlyRate();
    }


}
