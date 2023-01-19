package day29_practices.employeeTask;

public class Developer extends Employee {

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        if (programmingLanguage.equalsIgnoreCase("Java") ||programmingLanguage.equalsIgnoreCase("JavaScript")||
                programmingLanguage.equalsIgnoreCase("Python") || programmingLanguage.equalsIgnoreCase("Ruby")||
                programmingLanguage.equalsIgnoreCase("C#") || programmingLanguage.equalsIgnoreCase("C++") ||
                programmingLanguage.equalsIgnoreCase("Swift")){

            this.programmingLanguage = programmingLanguage;
        }else {
            System.out.println("Invalid programming language");
        }

    }

    public void coding(){
        System.out.println(getName() +" is coding");
    }

}
