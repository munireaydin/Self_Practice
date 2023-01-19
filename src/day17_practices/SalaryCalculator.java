package day17_practices;

public class SalaryCalculator {


    public int hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHour;
    public double salary;
    public double stateTax;
    public double federalTax;
    public double salaryAfterTax;


    public void setInfo(int hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHour = weeklyHour;
    }

    public double salary(){
        salary= hourlyRate * weeklyHour * 52;
        return salary;
    }

    public double stateTax(){
       stateTax= hourlyRate * weeklyHour * 52 *stateTaxRate;
        return stateTax;
    }

    public double federalTax(){
        federalTax = hourlyRate * weeklyHour * 52 * federalTaxRate;
        return federalTax;
    }

    public double salaryAfterTax() {
        salaryAfterTax = salary - (stateTax + federalTax);
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary +
                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", salaryAfterTax=" + salaryAfterTax +
                '}';
    }
}
   /*
   Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object


    */
