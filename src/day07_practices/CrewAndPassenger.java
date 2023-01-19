package day07_practices;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int total = 120;
        String result ="";

        if (total==50 || total == 75 || total ==100){
            if (total==50){
                result="20 crew, 30 passenger";
            }else if (total==75){
                result ="25 crew, 50 passenger";
            }else{
                result ="30 crew, 70 passenger";
            }
        }else {
            result= "The number of people on the ship is not valid";
        }
        System.out.println(result);
    }
}
