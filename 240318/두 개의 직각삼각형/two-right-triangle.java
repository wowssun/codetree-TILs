import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 왼쪽
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // 공백
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // 오른쪽
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println(); // 다음 행으로 이동
        }

    }
}