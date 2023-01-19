package day18_practices;

public class contactTest {
    public static void main(String[] args) {
        Contact contact1 = new Contact();

        contact1.setInfo("munire",9876543,"munire@hotmail.com");
        contact1.call();
        contact1.sendMessage();
        contact1.sendEmail();


    }

}
