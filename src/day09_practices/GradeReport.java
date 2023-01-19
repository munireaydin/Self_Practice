package day09_practices;
import java.util.Scanner;
public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your score: ");

        int score = input.nextInt();
        input.close();

        String grade = (score>=1 && score<=100)?
                        (score>=90)? "A" : (score >=80)? "B" : (score >=70)? "C" : (score >=60)? "D" : "F"
                     :"invalid score";


        System.out.println(grade);

    }
}
