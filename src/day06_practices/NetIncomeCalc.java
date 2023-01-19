package day06_practices;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary = 85_000;
        double taxRate = 0.35;
        boolean isMarried = false;


        if(salary>= 130000){
            taxRate = 0.35;
        }

        if(salary>= 100000 && salary<=129000){
            taxRate = 0.30;
        }

        if(salary>= 80000 && salary<=99000){
            taxRate = 0.25;
        }
        if(salary<=79000){
            taxRate = 0.20;
        }

        if(isMarried){
            taxRate -= 0.05;
        }
        double salaryAfterTax = salary - (salary * taxRate );
        System.out.println(" The salary after tax is: "+ salaryAfterTax);



    }
}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the Person is married, he/she will pay 5% less tax
 */