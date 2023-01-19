package day28_practices;

import java.time.LocalDate;

public class LocalDateTester {

    private LocalDate dateOfBirth ;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {

        LocalDate today= LocalDate.now();

        if (dateOfBirth.isAfter(today)){
            System.err.println("The date of birth can not be after today's date");
            System.exit(1);
        }

        this.dateOfBirth = dateOfBirth;
    }

    public LocalDateTester(LocalDate dateOfBirth) {
        setDateOfBirth(dateOfBirth);
    }

    public String toString() {
        return "LocalDateTester{" +
                "dateOfBirth=" + dateOfBirth +
                '}';
    }
}