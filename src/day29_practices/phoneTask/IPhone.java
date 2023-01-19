package day29_practices.phoneTask;

public class IPhone extends Phone {

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber + " is calling from Facetime ");
    }

    public void faceTime(String email){
        System.out.println("You can use Facetime with your email: " +email);
    }
}
