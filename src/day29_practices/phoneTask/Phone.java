package day29_practices.phoneTask;

public class Phone {

    private String brand;
    private String model;
    private double size;
    private double price;
    private String color;

    public void setInfo(String brand, String model, double size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if(brand == null || brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand is not set");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if(model == null || model.isEmpty() || model.isBlank()){
            System.err.println("Model is not set");
            System.exit(1);
        }
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0){
            System.out.println("Price can not be 0 or negative number");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if(color == null || color.isEmpty() || color.isBlank()){
            System.err.println("Color is not set");
            System.exit(1);
        }
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println(phoneNumber + " is calling");
    }

    public void text(long phoneNumber){
        System.out.println(phoneNumber + " texted");
    }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
