import java.util.Scanner;

public class Main {
    public static int cnt = 0;
    public static int oddEven (int n) {
        
        if (n == 1) {
            return cnt;
        }
        if (n % 2 == 0) {
            cnt++;
            return oddEven(n / 2);
        }else {
            cnt++;
            return oddEven(3 * n + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(oddEven(n));
    }
}