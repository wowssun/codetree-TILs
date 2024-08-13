import java.util.Scanner;

public class Main {
    public static int [] arr = new int[10];

    public static int gcd(int n, int m) {
        int gcdNum = 0; 
        for (int i = 1; i <= Math.min(n, m) ; i++) {
            if (n % i == 0 && m % i == 0){
                gcdNum = i;
            }
        }
        return gcdNum;
    }

    public static int lcm (int n) {
        if (n == 1) {
            return arr[0];
        }
        return (lcm(n-1) * arr[n-1]) / gcd(lcm(n-1),arr[n-1]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(lcm(n));
    }
}