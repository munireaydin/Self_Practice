package day09_practices;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class PlaceAndOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");

        String product = input.nextLine();

        System.out.println("Enter the price: ");

        double price = input.nextDouble();

        System.out.println("Enter the quantity; ");

        int quantity = input.nextInt();

       input.nextLine();

        System.out.println("Enter your first name: ");

        String firstName = input.next();

        input.close();

        double total = price * quantity;

        System.out.println(firstName + ", your order for "+quantity+ " "+ product+" has been places.Your total is $" + total);


    }
}
