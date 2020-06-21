import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().toCharArray()[0];
        char b = s.next().toCharArray()[0];
        if (a < b) {
            System.out.println(a + "," + b);
        } else {
            System.out.println(b + "," + a);

        }
    }
}