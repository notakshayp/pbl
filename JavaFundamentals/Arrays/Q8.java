import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
            sum += a[i];
        }
        // int sum = 0;
        System.out.println(sum);

        int temp = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == 6) {
                for (int j = i; j < size; j++) {
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

        System.out.println(sum);
    }
}