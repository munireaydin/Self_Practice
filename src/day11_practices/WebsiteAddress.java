package day11_practices;

public class WebsiteAddress {
    public static void main(String[] args) {

        String url = "www.cydeo.de";
        boolean isValid = url.startsWith("www.") && (url.endsWith(".com") ||url.endsWith(".edu") || url.endsWith(".gov") );

        if (isValid){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }




        /*  // this is my solution
        String url = "www.cydeo.de";
      boolean t = url.startsWith("www.");
      boolean e = url.endsWith(".com");

      if(t == true){
          if (url.endsWith(".com") ||url.endsWith(".edu") || url.endsWith(".gov")){
              System.out.println("The given website is valid");
          }else{
              System.out.println("The given website is not valid");
          }
      }else{
          System.out.println("The given website is not valid");
      }
*/

    }
}
/*
Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */