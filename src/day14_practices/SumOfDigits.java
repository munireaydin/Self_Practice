package day14_practices;

public class SumOfDigits {
    public static void main(String[] args) {


        String input = "A1B2C3";

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (ch >= '0' && ch<= '9') {

                sum += ch - 48;
            }
        }


        System.out.println("sum: " + sum);



    }
}
/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */