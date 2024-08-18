import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                Arrays.sort(arr,0,i);
                System.out.print(arr[i / 2 + 1] + " ");
            }
        }
    }
}