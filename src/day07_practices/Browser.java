package day07_practices;

public class Browser {
    public static void main(String[] args) {

        String browserName = "Chrome";


        if (browserName=="Chrome"|| browserName=="Firefox"||browserName=="Opera" ||browserName=="Safari" || browserName=="Edge"){
            System.out.println(browserName + " Browser is selected");

        }else {
            System.out.println("Invalid Browser Name");
        }

        System.out.println("-------------------------------");




    }
}
/*
Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */