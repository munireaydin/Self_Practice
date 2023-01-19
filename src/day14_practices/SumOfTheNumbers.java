package day14_practices;

public class SumOfTheNumbers {

    public static void main(String[] args) {


        int number = 50;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum);




    }
}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */