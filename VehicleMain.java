interface Vehicle{
    void start();
    void noOfGears(int a);
}
abstract class Bus implements Vehicle{
    public void start(){
        System.out.println("bus starts with key");
    }
    
        // public void noOfGears(int gears){
        //     System.out.println("Bus has "+gears+" gears");
        // }
    }

class Car implements Vehicle{
    public void start(){
        System.out.println("Car starts with key");
    }
    public void noOfGears(int gears){
        System.out.println("Car has "+gears+" gears");
    }
}
class Scooter implements Vehicle{
    public void start(){
        System.out.println("scooter starts with kick");
    }
    public void noOfGears(int gears){
        System.out.println("Scooter has "+gears+" gears");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        // Bus b = new Bus();
        // b.start();
        // b.noOfGears(6);
    }
}
