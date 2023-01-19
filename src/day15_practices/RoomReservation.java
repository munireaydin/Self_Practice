package day15_practices;

import java.util.Scanner;
import java.util.SortedMap;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to reserve a room?");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry.Would you like to reserve a room? Yes/No ");
            answer = input.next();
        }

        input.nextLine();

        if (answer.equals("yes") || answer.equals("no")) {
            if (answer.equals("no")) {
                System.out.println("Have nice day");
            } else {
                System.out.println("Which type of room do you want to reserve?");
                System.out.println("King Bed, Queen Bed or Single Bed");
                String answer2 = input.nextLine().toLowerCase();


                while (!(answer2.equals("king bed") || answer2.equals("queen bed") || answer2.equals("single bed"))) {
                    System.err.println("Invalid entry.Could you please reenter your selection?");
                    answer2 = input.nextLine();

                }


                if (answer2.equals("king bed")) {
                    System.out.println("King Bed ==> 120$");
                } else if (answer2.equals("queen bed")) {
                    System.out.println("Queen Bed ==> 100$");
                } else {
                    System.out.println("Single Bed ==> 80$");
                }

            }

        }


    }


}

/*
Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */