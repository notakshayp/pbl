public class Q14 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int itr = 0;
        int max = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(args[itr]);
                itr++;
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        System.out.println(max);

    }
}