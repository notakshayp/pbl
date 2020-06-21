public class Seventeen {
    public static void main(String[] args) {
        String a = args[0];
        String b = "";
        for (int i = 1; i <= a.length(); i++) {
            b += a.charAt(a.length() - i);
            // System.out.println(b);

        }
        // System.out.println(a + " " + b);
        if (a.equals(b)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}