package swdesign;

public class BirdFeederTester {

    private BirdFeeder birdFeeder;

    public BirdFeederTester(){
        this.birdFeeder = new BirdFeeder();
    }
    
    public static void main(String [] args){
         BirdFeederTester bfTest = new BirdFeederTester();

        for (int i = 0; i < 10; i++) {
            System.out.println("Testing the bird feeder");
            bfTest.birdFeeder.operate();
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted" + e.getMessage());
                System.exit(1);
            }
        }
    }
}