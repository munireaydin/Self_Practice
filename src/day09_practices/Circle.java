package day09_practices;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double radius = input.nextDouble();

        input.close();

        double area = 3 * radius * radius;
        double perimeter = 2 * 3 * radius;

        System.out.println("Area of the circle: " + area );
        System.out.println("Perimeter of the circle: " + perimeter);



    }
}
