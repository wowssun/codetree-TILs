import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print((n+1-j) + " ");
            }
            System.out.println();
        }
    }
}