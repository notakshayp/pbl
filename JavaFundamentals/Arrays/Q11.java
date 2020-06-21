import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        Boolean ans = true;
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
            if (a[i] != 4 && a[i] != 1) {
                ans = false;
            }
        }
        System.out.print(ans);
    }
}