import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int i = 1;

        while (true) {
            n /= i;

            cnt++;
            i++;

            if (n <= 1) {
                break;
            } 
        }
        System.out.print(cnt);

    }
}