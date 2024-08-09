import java.util.Scanner;

public class Main {

    public static int sumAll(int n) {
        if (n < 10) {
            return n;
        }

        return sumAll(n/10) + (n%10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        for (int i = 0; i < 3; i++) {
            num *= sc.nextInt();
        }

        System.out.print(sumAll(num));
    }
}