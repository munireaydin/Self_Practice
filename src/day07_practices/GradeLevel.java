package day07_practices;

public class GradeLevel {

    public static void main(String[] args) {
        byte grade = 10;
        String result = "";

        if (grade >= 1 && grade < 19) {
            if (grade < 6) {
                result = "Elementary School";
            } else if (grade < 9) {
                result = "Middle School";
            } else if (grade < 13) {
                result = "High School";
            } else if (grade < 17) {
                result = "College";
            } else {
                result = "Grad School";
            }
        } else {
            result = "Invalid grade level given";
        }

        System.out.println(result);

    }
}
