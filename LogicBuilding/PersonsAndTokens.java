import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PersonsAndTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        // for (int wtf : b) {
        // System.out.println(wtf);
        // }
        int[] ans = fun(b.clone());
        // for (int wtf : b) {
        // System.out.println(wtf);
        // }
        for (int itr = 2; itr >= 0; itr--) {
            // System.out.println(ans[itr]);
            int pt = 0;
            for (int ip = 0; ip < b.length; ip++) {
                if (b[ip] == ans[itr]) {
                    pt = ip;
                    break;
                }
            }
            if (itr == 2)
                System.out.print(a[pt]);
            else {
                System.out.print(":" + a[pt]);

            }
        }
    }

    public static int[] fun(int[] token) {
        Arrays.sort(token);
        int ret[] = new int[3];
        for (int i = 0; i < token.length - 3; i++) {
            if ((token[i] + 1) == (token[i + 1]) && (token[i + 1] + 1) == (token[i + 2])) {
                ret[0] = token[i];
                ret[1] = token[i + 1];
                ret[2] = token[i + 2];
                break;
            }
        }

        return ret;
    }
}