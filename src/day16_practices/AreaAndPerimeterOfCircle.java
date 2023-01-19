package day16_practices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a circle:");

        double radius = input.nextDouble();


        while (radius == 0 || radius < 0) {
            System.err.println("Invalid Entry for the radius of the circle");
            System.err.println("Enter the radius of a circle");
            radius = input.nextDouble();
        }

        while(!(radius== 0 || radius < 0)) {

            System.out.println("Diameter of the circle is: " + (2 * radius));
            System.out.println("Area of the circle is: " + (3.14 * radius * radius));
            System.out.println("Perimeter of the circle: " + (2 * 3.14 * radius));


            System.out.println("Would you like to calculate another circle? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry! Please re-enter your answer");
                System.out.println("Would you like to calculate another circle? Yes/No");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("yes")) {
                System.out.println("Enter the radius of a new circle:");
                radius = input.nextDouble();
            } else {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                System.exit(1);
            }

        }

    }
}
/*
Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */