import java.util.Scanner;

public class OneB {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        // if(a[a.length()-1]==b[b.length()-1])
        if (a % 10 == b % 10) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}