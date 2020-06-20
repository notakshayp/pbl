import java.util.Scanner;

public class OneA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a > 0) {
            System.out.println("Posstive");
        } else if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");

        }
    }
}