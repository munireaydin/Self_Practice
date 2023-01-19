package day07_practices;

public class Finra {
    public static void main(String[] args) {
        int num = 17;
        String result = "";

        if (num % 15 ==0){
            result = "FINRA";
        } else if (num % 5 ==0){
            result= "RA";
        }else if(num % 3== 0){
            result ="FIN";
        }
        System.out.println(result);
    }
}
