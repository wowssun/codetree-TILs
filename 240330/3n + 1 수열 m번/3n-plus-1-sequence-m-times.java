import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            int n = sc.nextInt();
            int cnt = 0;

            while (true) {

                if (n == 1) {
                    System.out.println(cnt);
                    break;
                }

                if (n % 2 == 0) {
                    n /= 2; 
                } else {
                    n = n * 3 + 1;
                }
                cnt++;
                

            }
                   
        }
    }
}