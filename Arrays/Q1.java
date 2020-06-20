public class Q1 {
    public static void main(String[] args) {
        int[] a = new int[args.length];
        int sum = 0;
        double avg;
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
            sum += a[i];
        }
        avg = sum / args.length;
        System.out.println("Sum= " + sum + " Avg= " + avg);
    }
}