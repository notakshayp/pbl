import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int[] a = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        Scanner s = new Scanner(System.in);
        int key = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}