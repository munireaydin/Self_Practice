package day11_practices;
import  java.util.Scanner;
public class ReallyNeverMind {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
         String word = input.next();

         input.close();

         if (word.endsWith("ly")){
             System.out.println("really???");
         }else {
             System.out.println("never mind");
         }
/*
  String lastTwoChars = word.substring( word.length()-2 ); // word's last two letters

        if(lastTwoChars.equals("ly")){
            System.out.println("really???");
        }else{
            System.out.println("Never mind");
        }

        input.close();
 */






    }
}
/*
Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */