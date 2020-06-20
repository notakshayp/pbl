import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        int[] b = new int[100000];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
            if (b[a[i]] == 0) {
                b[a[i]] = i;
                // System.out.print(a[i] + " ");

            }
        }

        for (int i = 0; i < size; i++) {
            if (b[a[i]] == i) {
                System.out.print(a[i] + " ");
            }
        }

    }
}