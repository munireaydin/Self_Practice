package day34_practices.car;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make == null || make.isEmpty()){
            System.err.println("It can not be null or empty");
            System.exit(1);
        }
            this.make = make;


        if (model == null || model.isEmpty()){
            System.err.println("Model can not be null or empty");
            System.exit(1);
        }
            this.model = model;


        if (year < 1886){
            System.err.println("Invalid year: " + year);
        }
            this.year = year;


        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.err.println("Price can not be negative");
        }else {
            this.price = price;
        }

    }

    public void setColor(String color) {

        if (color == null || color.isEmpty()){
            System.err.println("Color can not be null or empty");
            System.exit(1);
        }else {
            this.color = color;
        }

    }

    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println(make + " " + model+ " " + " is stopped");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +  "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()
 */