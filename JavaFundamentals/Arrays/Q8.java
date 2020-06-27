import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        int size = args.length;
        int[] a = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(args[i]); // s.nextInt();
            sum += a[i];
        }
        // int sum = 0;
        // System.out.println("Sum without removing 6-7: " + sum);

        int temp = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("i= " + i + "; ");
            if (a[i] == 6) {
                temp += a[i];
                for (int j = i + 1; j < size; j++) {
                    System.out.print("j= " + j + "; ");

                    if (a[j] == 7) {
                        temp += a[j];
                        sum = sum - temp;
                        temp = 0;
                        i = j;
                        break;
                    } else {
                        temp += a[j];
                    }
                }
            }
        }

        System.out.println("\nSum after removing 6-7: " + sum);
    }
}