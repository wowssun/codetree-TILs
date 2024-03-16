import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }

        boolean result = (cnt >= 3) ? true : false;

        if (result) {
            System.out.print("C");
        } else {
            System.out.print("N");
        }

    }
}