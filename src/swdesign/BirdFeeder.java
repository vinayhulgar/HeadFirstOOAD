package swdesign;
import java.util.ArrayList;
import java.util.Iterator;
import swdesign.FeedingDoor;
import swdesign.Sensor;

public class BirdFeeder
{
    // instance variables
    private static final int ON_THRESHOLD = 40;
    private static final int OFF_THRESHOLD = 25;
    private int lightLevel;
    private Sensor s1;
    private ArrayList<FeedingDoor> doors = null;

    // Default Constructors
    public BirdFeeder(){
        doors = new ArrayList<FeedingDoor>();
        lightLevel = 0;
        s1 = new Sensor();
        doors.add(new FeedingDoor());
    }

    public void operate(){
        lightLevel = s1.getLevel();
        if(lightLevel > ON_THRESHOLD){
            Iterator door_iter = doors.iterator();
            while(door_iter.hasNext()){
                FeedingDoor a = (FeedingDoor) door_iter.next();
                a.open();
                System.out.println("The door has opened.");
            }
        }

        if(lightLevel < OFF_THRESHOLD){
            Iterator door_iter = doors.iterator();
            while(door_iter.hasNext()){
                FeedingDoor a = (FeedingDoor) door_iter.next();
                a.close();
                System.out.println("The door has Closed.");
            }
        }

    }

}