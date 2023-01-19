package day11_practices;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = input.nextLine();

        input.close();


        int indexOfUnderscore = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexOfPoint = email.indexOf(".");

        String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, indexOfUnderscore);
        String lastName = email.substring(indexOfUnderscore + 1, indexOfUnderscore + 2).toUpperCase() + email.substring(indexOfUnderscore + 2, indexOfAt);
        String domain = email.substring(indexOfAt + 1, indexOfPoint);

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);


    }
}
/*
Create a class called EmailTask2.
   Assume that email address is constructed by Person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */