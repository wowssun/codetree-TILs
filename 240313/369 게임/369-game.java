import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = i / 10;
            int b = i % 10;
            boolean result = (a == 3 || a == 6 || a == 9) ? true : false;
            boolean result2 = (b == 3 || b == 6 || b == 9) ? true : false;

            if (i % 3 == 0 || result || result2 ) {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}