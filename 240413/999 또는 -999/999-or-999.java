import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[100];
        int cnt = 0;


        for (int i = 0; i < 100; i++) {
            int num = sc.nextInt();

            if (num == 999 || num == -999) {
                break;
            }
            arr[i] = num;
            cnt++;
        }

        int minVal = arr[0];
        int maxVal = arr[0];

        for (int i = 0 ; i < cnt; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.printf("%d %d", maxVal, minVal);
    }
}