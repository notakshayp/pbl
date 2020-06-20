import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }

    }
}