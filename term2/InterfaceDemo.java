package term2;

interface Vehicle {
    void start();  
    void stop();   
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with a key ignition.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping using brakes.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with a self-start button.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping using disc brakes.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();

        System.out.println(); 

        Vehicle myBike = new Bike();  
        myBike.start();
        myBike.stop();
    }
}