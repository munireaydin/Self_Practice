package day18_practices;

public class Contact {

    public String name;
    public int phoneNumber;
    public String eMail;

    public void setInfo(String name, int phoneNumber, String eMail) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;




    }

    public void call(){
        System.out.println("Calling " + name + " now");
    }

    public void sendMessage(){
        System.out.println("sending message to " + phoneNumber + " now");
    }

    public void sendEmail(){
        System.out.println("sending email to " + eMail +" now" );
    }

}
/*
Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"
 */