import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[100];
        int n = sc.nextInt();
        int cnt = 0;
        

        for (int i = 0; i < 100; i++) {
            arr[i] = n * (i + 1);

            if (arr[i] % 5 == 0) {
                cnt++;
            }

            System.out.print(arr[i] + " ");

            if (cnt == 2) {
                break;
            }

        }
    }
}