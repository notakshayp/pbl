public class Q2 {
    public static void main(String[] args) {
        int[] a = new int[args.length];
        int min = 99999999;
        int max = 0;
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Min= " + min + " Max= " + max);
    }
}