package day14_practices;

public class PalindromeWords {

    public static void main(String[] args) {

        String str1 = "Level";

        String str2 = "";

        for (int i = str1.length()-1; i >= 0 ; i--) {
           str2 +=  str1.charAt(i);
        }

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equalsIgnoreCase(str2));

    }
}
