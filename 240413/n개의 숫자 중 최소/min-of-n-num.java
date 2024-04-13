import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minVal = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }  
        }

        for (int num : arr) {
            if (minVal == num){
                cnt++;
            }
        }

        System.out.printf("%d %d", minVal, cnt);
    }
}