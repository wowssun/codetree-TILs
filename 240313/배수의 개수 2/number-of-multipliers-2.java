import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        for (int i = 1; i <= 10; i++){
            int input = sc.nextInt();

            if (input % 2 != 0) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}