public class Q2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Akshay P", 50000, 2000, "A123");
        // e1.setName("Akshay");
        e1.setName("Akshay Poothamkotil");
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getAnualSalary());
        System.out.println("Year: " + e1.getYear());
        // System.out.println(""+get());
        System.out.println("NationalInsuranceNumber:" + e1.getNationalInsuranceNumber());

    }
}