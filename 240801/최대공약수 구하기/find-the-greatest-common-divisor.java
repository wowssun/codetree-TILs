import java.util.Scanner;

public class Main {

    public static void gcd(int n, int m) {
        int gcdNum = 0; 
        for (int i = 1; i <= 100; i++) {
            if (n % i == 0 && m % i == 0){
                gcdNum = i;
            }
        }
        System.out.print(gcdNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        gcd(n,m);
    }
}