import java.util.Scanner;

import javafx.scene.transform.Scale;
import jdk.nashorn.internal.runtime.regexp.joni.Syntax;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        inp = inp.toLowerCase();
        String[] a = inp.split(",");
        if (a[0].charAt(a[0].length() - 1) == a[1].charAt(0)) {
            a[1] = a[1].substring(1);
        }
        System.out.println(a[0] + a[1]);
    }
}