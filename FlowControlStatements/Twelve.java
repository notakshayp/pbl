import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Twelve {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");

    }
}