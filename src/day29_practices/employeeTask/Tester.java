package day29_practices.employeeTask;

public class Tester extends Employee { // Tester Is An Employee

    public void testing(){
        System.out.println(getName() + " is testing");
    }


    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Munire",'F',20,"A45","SDET",65000);
        System.out.println(tester);

        tester.testing();
    }
}
