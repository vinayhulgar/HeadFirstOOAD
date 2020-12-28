package swdesign;

public class Sensor {

    private int lightLevel;

    public Sensor(){
        lightLevel = 0;
    }

    public int getLevel(){
        lightLevel = (int) (Math.random()*100);
        return lightLevel;
    }
    
}