public class Q13 {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int itr = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = Integer.parseInt(args[itr]);
                itr++;
            }
        }

        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");

        }

    }
}