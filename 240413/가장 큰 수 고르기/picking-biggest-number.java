import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];
        final int INT_MIN = Integer.MIN_VALUE;
        int maxVal = INT_MIN;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.print(maxVal);
    }
}