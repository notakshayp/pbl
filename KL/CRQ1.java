public class CRQ1 {
    public static void main(String[] args) {
        int size = args.length;
        int p = 0;
        int[][] a = new int[(int) Math.sqrt(size)][];
        for (int i = 0; i < Math.sqrt(size); i++) {
            for (int j = 0; j < Math.sqrt(size); j++) {
                a[i][j] = Integer.parseInt(args[p]);
                p++;
            }
            // System.out.print(args[i] + " ");
        }
    }
}