package day06_practices;

public class OxygenTank {
    public static void main(String[] args) {
        int levelNumber = 65;
        String result = "";

        if (levelNumber>= 50 &&levelNumber<60){
            result = "Be careful now you at 50% ";
        }

        if (levelNumber>= 60 &&levelNumber<70){
            result = "Start to head back ";
        }
        if (levelNumber>= 70 &&levelNumber<80){
            result = "Don't go too far ";
        }
        if (levelNumber>= 80 &&levelNumber<90){
            result = "Still okay ";
        }
        if (levelNumber>= 90){
            result = "Your tank is full ";
        }

        System.out.println(result);



    }
}
/*
Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */