package day26_practices;

public class TestPerson {

    public static void main(String[] args) {

       Person person1 = new Person("Munire",35,'F');
       Person person2 = new Person("Josh", 28, 'M');



       person1.eat("Bread");

       person1.sleep();

       person1.drink("water");

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);



        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);



    }
}
