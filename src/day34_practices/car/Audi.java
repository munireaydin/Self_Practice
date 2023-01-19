package day34_practices.car;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, double price, String color) {
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
}
