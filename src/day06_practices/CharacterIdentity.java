package day06_practices;

public class CharacterIdentity {
    public static void main(String[] args) {

        //this is Muhtar's solution

        char ch = '@';

        boolean isDigit = ch >= '0' && ch <= '9';
        boolean isLetter = (ch >= 'A' && ch <= 'Z' )  || (ch >= 'a' && ch <= 'z');
        boolean isSpecialChar = !isDigit && !isLetter;

        String result = "";

        if(isDigit){
            result = "Digit";
        }

        if( isLetter  ){
            result = "Alphabetic";
        }

        if(isSpecialChar){
            result = "Special Character";
        }

        System.out.println(result);



      /*
        // this is my solution
        char character = '9';
        String result = "";

        if ((character >= 33 && character<= 47)||(character>= 58 &&character<= 64)||(character>=91 && character<=96)||((character>=123 && character<=126))){
            result= "Special Character";
        }

        if (character>=48 && character<=57){
            result = "digit";
        }
        if((character>=65 && character<=90)||(character>=97 && character<=122)){
            result= "Alphabetic Character";
        }

        System.out.println(result);

*/

    }
}
/*
Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the characters on ASCII table
 */