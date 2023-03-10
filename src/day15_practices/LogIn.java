package day15_practices;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

/*

        for (int i = 1; i <= 3; i++) {

            System.out.println("username: ");
            String username = input.nextLine().toLowerCase();

            System.out.println("password: ");
            String password = input.next();

            input.nextLine();

            if (username.equals("cydeo") && password.equals("cydeo123")){
                System.out.println("Logged in");
                break;
            } else if (i==3 && !(username.equals("cydeo") && password.equals("cydeo123"))) {
                System.out.println("Your account is locked");
            }

        }


*/  // that is my solution

        // this is Muhtar's solution:

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){  // if the credentials are correct
            System.out.println("Logged in");
        }else{ // otherwise

            for (int i = 0; i < 3; i++) { //i : 0, 1, 2

                System.err.println("Incorrect username or password, please re-enter");

                System.out.println("Enter your username:");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){ //if the user enters valid credentials
                    System.out.println("You are now logged in");
                    break; // exits the loop
                }

            }

            if( ! (u.equals("Cydeo") && p.equals("WoodenSpoon") ) ){ // after all three attempts, if the username & password are still incorrect
                System.err.println("Your account now is locked, please contact with the support team");
            }


        }


        input.close();







    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to
                enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */