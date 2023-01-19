package day06_practices;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 35;
        int b = 40;
        int c = 50;

        int result = 0;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            result = a;
        }

        if (bIsMedian) {
            result = b;
        }

        if (cIsMedian) {
            result = c;
        }

        System.out.println(result + " is the median number");
    }

}
/*
Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */