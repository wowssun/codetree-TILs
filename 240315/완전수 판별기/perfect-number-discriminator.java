import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            // 먼저 약수 구하기 근데 자기 자신은 빼고 
            if (n % i == 0 && i != n) {
                sum += i;
            }
        }
        String result = sum == n ? "P" : "N";
        System.out.print(result);
    }
}