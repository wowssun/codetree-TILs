import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt_1 = 0;

        for (int i = start; i <= end; i++) {
            int cnt_2 = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt_2++;
                }
            }
            if (cnt_2 ==3) {
                cnt_1++;
            }
        }
        System.out.print(cnt_1);
    }
}