import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];
        int[] newArr = new int[100];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0) {
                newArr[cnt++] = arr[j];  // cnt가 제일 마지막 계산 
            }
        }

        for (int k = 0; k < cnt; k++) {
            System.out.print(newArr[k] + " ");
        }
    }
}