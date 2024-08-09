import java.util.Scanner;

public class Main {

    public static int sumAll (int n) {
        if (n == 2) {
            return 2;
        }

        if (n == 1) {
            return 1;
        }
        return n + sumAll(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(sumAll(n));
    }
}