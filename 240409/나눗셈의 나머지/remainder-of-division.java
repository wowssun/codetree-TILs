import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] cnt = new int[10];
        int sum = 0;

        while (a > 1) {
            cnt[a % b]++; 
            a /= b;
        }
        
        // 나머지는 b 미만으로 나옴 
        for (int i= 0; i < b; i++) {
            sum += cnt[i] * cnt[i];
        }

        System.out.print(sum);
    }
}