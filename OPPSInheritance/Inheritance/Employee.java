public class Employee extends Person {
    private double anualSalary;
    private int year;
    private String nationalInsuranceNumber;

    Employee() {
        anualSalary = 0;
        year = 1970;
        nationalInsuranceNumber = "No Provided";
    }

    Employee(double anualSalary, int year, String nationalInsuranceNumber) {
        this.anualSalary = anualSalary;
        this.year = year;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    Employee(String name, double anualSalary, int year, String nationalInsuranceNumber) {
        super.setName(name);
        this.anualSalary = anualSalary;
        this.year = year;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    void setAnualSalary(double anualSalary) {
        this.anualSalary = anualSalary;
    }

    double getAnualSalary() {
        return this.anualSalary;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getYear() {
        return this.year;
    }

    void set(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    String getNationalInsuranceNumber() {
        return this.nationalInsuranceNumber;
    }
}