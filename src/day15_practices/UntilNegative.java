package day15_practices;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



        int result = 0;

        while(true){
            System.out.println("Enter numbers:");
            int num = input.nextInt();

            if(num<0){
                break;
            }
            result += num;

        }




        System.out.println(result);


    }
}
/*
Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

 */