package day17_practices;

public class Test {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("BMW","i218",2015,"white",14500);

        System.out.println(car1);

        System.out.println("-----------------------------------------------");

        Student student1 = new Student();

        student1.setInfo("Munire",'F',35,"187AC",4,true);

        System.out.println(student1);

        System.out.println("-----------------------------------------");


        Rectangle rectangle1 = new Rectangle();

        rectangle1.setInfo(5,4);

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println(rectangle1);

        System.out.println("----------------------------------------------");

        Address address1 = new Address();

        address1.setInfo(7912,"Jones Branch Dr","McLean","Va",22012);

        System.out.println(address1);


        System.out.println("--------------------------------");

        Item item1 = new Item();

        item1.setInfo("Halley",0.75,5);

        item1.calcCost();

        System.out.println(item1);



    }
}
