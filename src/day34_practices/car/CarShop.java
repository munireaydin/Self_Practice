package day34_practices.car;

public class CarShop {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", "Corolla", 2015, 20000,"Blue");

        System.out.println(toyota);
        toyota.start();
        toyota.drive();
        toyota.stop();

        System.out.println("------------------------------------------------");
        Mercedes mercedes = new Mercedes("Mercedes","A2", 2017,25000,"Black");

        mercedes.drive();
        mercedes.start();
        mercedes.stop();
        mercedes.autoPark();


        System.out.println("-----------------------------------------------");

        Tesla tesla = new Tesla("Tesla","Model Y", 2022,60000,"Blue");

        tesla.autoPark();
        tesla.selfDrive();

        System.out.println("-------------------------------------------------");

        CydeoCar cydeoCar = new CydeoCar("CydeoCar","XYZ",2023, 40000,"White");

        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();
        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.stop();

    }
}
