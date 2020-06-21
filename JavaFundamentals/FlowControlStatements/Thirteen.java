public class Thirteen {
    static Boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}