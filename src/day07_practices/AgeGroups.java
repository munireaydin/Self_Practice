package day07_practices;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 160;
        String result= "Teenager";

        if (age>0 && age<=150){
            if (age<21){
                result= "Teenager";
            }else if(age<55){
                result = "Adult";
            }else{
                result = "Senior";
            }

        }else {
            result ="invalid";
        }

        System.out.println(result);
    }
}
