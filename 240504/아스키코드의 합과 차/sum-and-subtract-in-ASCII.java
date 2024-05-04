import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = (int)sc.next().charAt(0);
        int m = (int)sc.next().charAt(0);

        System.out.print((n + m) + " ");

        if (n > m) {
            System.out.print(n - m);
        } else {
            System.out.print(m - n);
        }
    }
}