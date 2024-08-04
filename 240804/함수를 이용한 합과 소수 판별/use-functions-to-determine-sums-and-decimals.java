import java.util.Scanner;

public class Main {

    public static boolean isPrime (int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven (int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;


        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isEven(i)){
                cnt++;
            }
        }

        System.out.print(cnt);
        
    }
}