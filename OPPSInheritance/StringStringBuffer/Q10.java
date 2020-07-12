import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String a[] = inp.split(",");
        String s1 = a[0];
        int s2 = Integer.parseInt(a[1]);
        System.out.println(s1.substring(s1.length() - s2));
    }
}