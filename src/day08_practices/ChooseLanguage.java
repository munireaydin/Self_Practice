package day08_practices;

public class ChooseLanguage {
    public static void main(String[] args) {

        int n = 5;

        String result = (n==1)? "Hello, thank you for your call" :(n==2)? "Hola, gracias para llamar"
                :(n==3)?"Merhaba, aradiginiz icin tesekkür ederiz" : (n==4)? "Ptivet, spasibo za vash zvonok"
                :(n==5)? "Merci,pour votre appel": "InvalidNumber";

        System.out.println(result);


    }
}
