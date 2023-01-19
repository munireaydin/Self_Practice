package day26_practices;

public class TestCydeoStudent {
    public static void main(String[] args) {

        CydeoStudent students = new CydeoStudent("Munire",35,'F',23,'A',2345,32);

        System.out.println(students);

        students.study();

        students.attendClass();

        CydeoStudent.printSchoolName();

        CydeoStudent.printProgLanguage();


    }
}
