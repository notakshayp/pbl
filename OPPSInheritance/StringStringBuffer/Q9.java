import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String a[] = inp.split(",");
        String s1 = a[0];
        String s2 = a[1];
        String ans = "" + s1.charAt(0) + s2.charAt(0) + s1.substring(1) + s2.substring(1);
        System.out.println(ans);
    }
}