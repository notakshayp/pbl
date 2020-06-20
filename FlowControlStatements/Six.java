public class Six {
    public static void main(String[] args) {
        char gender = args[0].toCharArray()[0];
        int age = Integer.parseInt(args[1]);
        if (gender == 'M') {
            if (age >= 1 && age <= 58) {
                System.out.println("Intrest is 8.4");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Intrest is 10.5");

            }
        } else {

            // If the gender is 'Female' and age is between 1 and 58, the percentage of
            // interest is 8.2%.

            // If the gender is 'Female' and age is between 59 and 100, the percentage of
            // interest is 9.2%.

            if (age >= 1 && age <= 58) {
                System.out.println("Intrest is 8.2");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Intrest is 9.2");

            }
        }
    }
}