import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        // System.out.println(a[0] + " " + a[1] + " " + a[a.length - 2] + " " +
        // a[a.length - 1]);
    }
}