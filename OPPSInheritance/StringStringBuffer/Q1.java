import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = ;
        StringBuffer str = new StringBuffer(sc.nextLine());
        // System.out.println(str.reverse());
        if (str.toString().equals(str.reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");

        }
    }
}