package day13_practices;

import java.util.Scanner;

public class Combine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter two words: ");

        String str1 = input.next(),
                str2 = input.next();


        combine(str1, str2);

    }

    public static void combine(String word1, String word2) {

        String word1Last = word1.substring(word1.length() - 1);
        String word2first = word2.substring(0, 1);

        if (word1Last.equalsIgnoreCase(word2first)) {
            System.out.println(word1 + word2.substring(1));
        } else {
            System.out.println(word1 + word2);
        }

    }

}
