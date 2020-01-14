package LSP;

public class Main {
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle bus = new Bus();

        System.out.println("speed of a car : "+car.getSpeed());
        System.out.println("capacity of a car : "+car.getCubicCapacity());
        car.speedUp();
        car.speedUp();
        System.out.println("speed of a car : "+car.getSpeed());
        System.out.println();

        System.out.println("speed of a bus : "+bus.getSpeed());
        System.out.println("capacity of a bus : "+bus.getCubicCapacity());
        bus.speedUp();
        bus.speedUp();
        System.out.println("speed of a bus : "+bus.getSpeed());


    }
}
