import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = new String();
        if (s.length() % 2 == 0) {
            ans = s.substring(0, s.length() / 2);
        } else {
            ans = null;
        }
        System.out.println(ans);
    }
}