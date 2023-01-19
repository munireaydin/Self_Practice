package day09_practices;
import java.util.Scanner;

public class Day9TaskOne {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("How many people do you live with?");

        int number = input.nextInt();
        input.close();

        String result="";

        if (number>=1 && number<=2){
            result= "Live with less than 3 people";
        }

        if (number>=3 && number<=6){
            result= "Live with 3 - 6 people";
        }

        if (number>6){
            result= "Live with more than 6 people";
        }

        System.out.println(result);

    }
}
