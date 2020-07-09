import java.util.Scanner;

public class matrixq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter n and m ");
        int n = sc.nextInt();
        int l = 0;
        int m = sc.nextInt();
        String a[] = s.split(" ");
        int b[][] = new int[n][m];
        int c[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = Integer.parseInt(a[l]);
                l++;
            }
        }
        if (n != m) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    c[j][i] = b[i][j];

                }
            }

        } else {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    c[i][j] = b[i][j];

                }
            }
        }
        int h = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                h = 0;
                for (int k = 0; k < m; k++) {
                    h += b[i][k] * c[k][j];
                } // end of k loop
                System.out.print(h + " "); // printing matrix element
            }
            System.out.println();
        }
    }
}