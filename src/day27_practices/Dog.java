package day27_practices;

public class Dog {
    public String breed,color;
    public char size, gender;
    public static int numberOfLegs = 4,
            numberOfEyes =2,
            numberOfWings = 0;
    public boolean isFriendly ;

    public Dog(String breed, String color, char size, char gender, boolean isFriendly) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.isFriendly = isFriendly;
    }

    static {
        numberOfLegs = 4;
        numberOfEyes =2;
        numberOfWings = 0;
    }

    public void eat(){
        System.out.println("The dog is eating");
    }

    public void drink(){
        System.out.println("The dog is drinking");
    }

    public void sleep(){
        System.out.println("The dog is sleeping");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
/*
 Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */