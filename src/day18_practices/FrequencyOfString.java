package day18_practices;

public class FrequencyOfString {

    public static void main(String[] args) {


        String str = "aaabbccccddeeee";
        int result = 0;
        String output = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count > result && !output.contains(ch + "")) {
                result = count;
                output = "" + ch;
            } else if (count == result && !output.contains(ch + "")) {
                result = count;
                output += ch;
            }else {
                output += "";
            }


        }


        for (int k = 0; k < output.length(); k++) {
            System.out.println(output.charAt(k));

        }

    }

}
/*
Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */