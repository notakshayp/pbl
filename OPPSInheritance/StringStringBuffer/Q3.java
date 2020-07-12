import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();
        s = s.substring(0, 2);
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += s;
        }
        System.out.println(ans);
    }
}