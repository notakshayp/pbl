import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("[a-zA-Z0-9]?[*]+[a-zA-Z0-9]?", "");
        System.out.print(str);
    }
}