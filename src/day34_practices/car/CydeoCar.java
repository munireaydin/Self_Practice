package day34_practices.car;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{


    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is starting");
    }

    @Override
    public void drive() {
        System.out.println("You are driving " + getMake() + " " + getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " is parking automatically");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " is self driving");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " is flying");
    }
}
