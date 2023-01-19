package day19_practices;

public class Classmates2 {
    public static void main(String[] args) {

        String[] classmates= {"Yasemin", "Aylin", "Bahadir", "Cemil", "Gürcan", "Kudret", "Nazife", "Sakire","Zehra","Esat"};

        String result="";

        for (int i = 0; i < classmates.length; i++) {
            result = classmates[i];

            for (int j = result.length()-1; j >=0 ; j--) {
                System.out.print(result.charAt(j));
            }
            System.out.println();

        }


    }
}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */