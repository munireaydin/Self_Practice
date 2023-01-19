package day13_practices;

public class Combine2 {
    public static void main(String[] args) {

        String word1 = "one";
        String word2 = "eight";
        System.out.println(twoNumber(word1, word2));
    }

    public static String twoNumber(String str1, String str2) {

        String result = "";

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            result = str1 + str2.substring(1);


        } else {
            result = str1 + str2;
        }
        return result;

    }
}