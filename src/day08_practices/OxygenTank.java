package day08_practices;

public class OxygenTank {
    public static void main(String[] args) {

        int oxygenLevel=30;

        String result = (oxygenLevel>90)? "Your tank is full"  : (oxygenLevel>80)?"Still okay"
                :(oxygenLevel>70)?"Don't go too far": (oxygenLevel>60)?"Start to head back"
                :(oxygenLevel>50)?"Be careful now you are at 50%":" ";

        System.out.println(result);

    }
}










