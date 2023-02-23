package guests;

public class Guest {

    private String name;
    private Boolean checkedInStatus;

    public Guest (String name){
        this.name = name;
        this.checkedInStatus = false;

    }

    public String getName(){
        return this.name;
    }
    public Boolean getCheckedInStatus(){
        return this.checkedInStatus;
    }
    public void setCheckedInStatus(Boolean status){
        this.checkedInStatus = status;
    }


}
