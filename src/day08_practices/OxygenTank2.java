package day08_practices;

public class OxygenTank2 {
    public static void main(String[] args) {

        int level =75;
        String result ="";

        if (level<=100 && level>=50){

            result= (level>=90)? "Your tank is full" : (level>=80)?"Still okay" :(level >=70)? "Do not go so far"
                    :(level>=60)? "Start to head back" : "Be careful now you are at 50%";
        }else {
            result = "Invalid Number";
        }


        System.out.println(result);


    }
}
