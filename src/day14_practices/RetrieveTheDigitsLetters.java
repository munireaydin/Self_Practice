package day14_practices;

public class RetrieveTheDigitsLetters {

    public static void main(String[] args) {


        String input = "mn@#123Ab!";

        String letters = " ";
        String digits = " ";
        String specialChars = " ";

        for (int i = 0; i <= input.length()-1; i++) {

            char ch = input.charAt(i);
            if ((ch>= 'A' && ch<= 'Z') ||(ch>= 'a' && ch<= 'z')){

                letters += ch;
            } else if (ch>= '0' && ch<= '9') {
                digits += ch;

            }else{

               specialChars += ch;
            }


        }

        System.out.println("letters:" + letters);
        System.out.println("digits:" + digits);
        System.out.println("special chars:" +specialChars);

    }
}
/*
write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */