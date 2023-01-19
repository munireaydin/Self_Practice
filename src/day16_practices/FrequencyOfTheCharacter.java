package day16_practices;

public class FrequencyOfTheCharacter {
    public static void main(String[] args) {

       String str = "aabcccd";
       //            0123456
       String output ="";  //a2b1c3d1


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (!output.contains(""+ch)){
                output += ""+ ch +count ;
            }


        }

        System.out.println(output);
    }
}
/*
Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

 */