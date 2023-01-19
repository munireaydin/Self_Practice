package day09_practices;
import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int speedLimit = 55;

        System.out.println("Enter your current speed: ");

        int speed = input.nextInt();
        input.close();

        int overLimit = speed - speedLimit;

        if (speed> speedLimit){
            System.out.println("You are driving " + overLimit + " mph over the limit. Slow down!");
        }else {
            System.out.println("");
        }

    }

}
