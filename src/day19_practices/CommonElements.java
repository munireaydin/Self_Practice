package day19_practices;

public class CommonElements {
    public static void main(String[] args) {

int[] arr1 = {1,2,3,4,5};
int[] arr2 = {4,5,6,7,8};

String result= "";

        for (int i = 0; i < arr1.length; i++) {

            int first= arr1[i];

            for (int j = 0; j < arr2.length; j++) {

               if (first == arr2[j]){
                   result+= first +" ";
               }

            }

        }

        System.out.print(result);



    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

 */