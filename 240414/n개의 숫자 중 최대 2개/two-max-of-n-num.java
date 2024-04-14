import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/* if (A[0] > A[1]){
            max1 = A[0];
            max2 = A[1];
        }
        else{
            max1 = A[1];
            max2 = A[0];
        }

        // Step 2: 3번째 원소부터 보면서 max1과 max2를 갱신합니다.
        for (int i = 2; i < n; i++) {
            if (A[i] >= max1) {
                // Case 1: 지금까지 본 숫자들보다 좋다면
                //         max2, max1 모두 갱신해줍니다.
                max2 = max1;
                max1 = A[i];
            } 
            else if (A[i] > max2){
                // Case 2: max2보다만 좋다면 max2를 갱신합니다.
                max2 = A[i];
            }
        }
*/