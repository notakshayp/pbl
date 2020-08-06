import java.util.Scanner;

class TraverseArrayFindKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(fun(a, n));
    }

    public static int fun(int[] a, int n) {
        int min = a[0];
        boolean f = true;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                f = false;
                break;
            } else {
                if (min > a[i]) {
                    min = a[i];
                }
            }

        }

        if (f) {
            return min;// all +ive
        } else {
            return fun2(a);

        }

    }

    public static int fun2(int[] a) {
        int sum = a[0] % 10;
        boolean f = true;
        int itr = a[0] / 10;
        for (;;) {
            int key = a[itr] % 10;

            if (a[itr] < 0) {
                key *= -1;
                if (f == true) {
                    sum += key;
                    f = false;
                } else {
                    sum -= key;
                    f = true;
                }
                // System.out.println("\nkey" + key + "\tadd" + itr + "\tsum" + sum);
                return sum;
            } else {
                if (f == true) {
                    sum += key;
                    f = false;
                } else {
                    sum -= key;
                    f = true;
                }
            }
            itr = a[itr] / 10;
            // System.out.println("\nkey" + key + "\tadd" + itr + "\tsum" + sum);
        }
    }
}