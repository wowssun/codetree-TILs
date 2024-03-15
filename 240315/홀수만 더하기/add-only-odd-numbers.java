import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int input = sc.nextInt();

            if (input % 2 != 0 && input % 3 == 0) {
                sum += input;
            }
        }

        System.out.print(sum);
    }
}