package day28_practices;

public class Credentials {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

      if (!isStrongPassword(password)){
          System.out.println("password MUST be a strong password");
          System.exit(1);
      }

        this.password = password;
    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public boolean isStrongPassword(String password){


        int letter=0;
        int specialCharacter= 0;
        int digit = 0;


        for (char each : password.toCharArray()) {
            if (Character.isLetter(each)){
                letter++;
            } else if (Character.isDigit(each)) {
                digit++;
            }else{
                specialCharacter++;
            }
        }

        if(letter== 0 || specialCharacter == 0 || digit == 0 || password.contains(" ") || password.length()<8){
            return false;
        }else{
            return true;
        }

    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
   /*
   create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()
    */