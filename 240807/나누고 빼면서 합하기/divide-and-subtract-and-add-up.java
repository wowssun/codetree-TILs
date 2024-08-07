import java.util.Scanner;

public class Main {

    public static int m;

    public static int sumArr(int[] arr) {
        int sum = 0;
        while (m > 0) {
            if (m % 2 == 0) {
                sum += arr[m-1];
                m /= 2;
            } else {
                sum += arr[m-1];
                m -= 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       m = sc.nextInt();

       int [] arr = new int[n];

       for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
       }

       int result = sumArr(arr);
       System.out.print(result);
    }
}