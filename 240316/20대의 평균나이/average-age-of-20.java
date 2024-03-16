import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, cnt = 0;

        while (true) {
            int age = sc.nextInt();
            
            if (age >= 30 || age <= 19) {
                break;
            }
            sum += age;
            cnt++;
        }
        double avg = (double)sum / cnt;
        System.out.printf("%.2f", avg);
    }
}