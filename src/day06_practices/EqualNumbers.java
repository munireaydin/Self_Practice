package day06_practices;

public class EqualNumbers {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 100;
        int num3 = 240;
        String result = "";

        if (num1 == num2 && num1 == num3) {
            result = "all equal";
        }

        if (num1 == num2 && num1 != num3) {
            result = "n1&n2 are equal";
        }

        if (num1 != num2 && num2 == num3) {
            result = "n2&n3 are equal";
        }

        if (num1 != num2 && num1 == num3) {
            result = "n3&n1 are equal";
        }
        if (num1 != num2 && num1 != num3 && num2 != num3) {
            result = "none of them are equal";
        }
        System.out.println(result);


    }
}
/*
Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
 */