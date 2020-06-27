class Calculator {
    static int powerInt(int a, int b) {
        return (int) Math.pow(a, b);
    }

    static double powerDouble(double a, double b) {
        return Math.pow(a, b);
    }

}

public class Q2 {
    public static void main(String[] args) {
        System.out.println(Calculator.powerDouble(10, 3));
        System.out.println(Calculator.powerInt(10, 3));
    }
}