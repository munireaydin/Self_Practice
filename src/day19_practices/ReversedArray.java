package day19_practices;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {

        int[] array= {1,2,3,4,5};

        int[] arr = new int[5];


        for (int i = array.length - 1; i >= 0; i--) {


                arr[array.length-1-i] = array[i];

        }

        System.out.println(Arrays.toString(arr));

    }
}
/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */