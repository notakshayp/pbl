import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        if (s1.charAt(0) == 'x' && s1.charAt(s1.length() - 1) == 'x') {
            s1 = s1.substring(1, s1.length() - 1);
        } else if (s1.charAt(0) == 'x') {
            s1 = s1.substring(1);
        } else if (s1.charAt(s1.length() - 1) == 'x') {
            s1 = s1.substring(0, s1.length() - 1);
        }
        System.out.println(s1);
    }
}