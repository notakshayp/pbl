import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
            if (a[i] != 10) {
                b[j] = a[i];
                j += 1;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(b[i] + " ");
        }
    }
}