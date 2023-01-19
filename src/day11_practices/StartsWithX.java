package day11_practices;
import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();

        input.close();

        if(word.charAt(0) == 'x'){
            word = word.replaceFirst("x", "a");
        }

        System.out.println(word);








        /* That is my solution
        String sub = word.substring(1);
        String result= "";

        char firstLetter = word.charAt(0);
        if (firstLetter == 'x') {
            result = "a" + sub ;
        }

        System.out.println(result);

*/



    }
}
/*
Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */