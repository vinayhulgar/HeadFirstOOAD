package swdesign;

public class FeedingDoor {

    private boolean doorOpen;

    public FeedingDoor(){
        doorOpen = false;
    }

    public void open(){
        if(doorOpen == false){
            doorOpen = true;
        }
    }

    public void close(){
        if(doorOpen == true){
            doorOpen = false;
        }
    }
    
    public boolean isOpen(){
        return doorOpen;
    }
}