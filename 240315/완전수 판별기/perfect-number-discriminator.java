import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            // 약수 구하기 자신빼고 범위 체크
            if (n % i == 0) {
                sum += i;
            }
        }
        String result = sum == n ? "P" : "N";
        System.out.print(result);
    }
}