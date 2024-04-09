import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int [] cnt = new int[10];

        int i = 0;

        while (true) {

            cnt[a % b]++; 
            a = a / b;

            if (a <= 1) {
                break;
            }

        }

        int sum = 0;
        for (int j = 0; j < 10; j++) {
            sum += cnt[j] * cnt[j];
        }
        System.out.print(sum);
    }
}