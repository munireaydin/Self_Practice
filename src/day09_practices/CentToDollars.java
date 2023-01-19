package day09_practices;
import java.util.Scanner;
public class CentToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents: ");

        int cents = input.nextInt();
        input.close();

        int dollar = cents / 100;
        int rest = cents % 100;

        System.out.println(cents + " cents equal to: " +dollar + " dollars and " + rest+ " cents");


    }
}
