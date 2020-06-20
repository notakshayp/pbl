import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int[] ans = new int[2];
        for (int i = 0; i < 3; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b[i] = s.nextInt();
        }
        ans[0] = a[1];
        ans[1] = b[1];
        System.out.print(ans[0] + " " + ans[1]);
    }
}