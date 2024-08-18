import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[2 * n];

        for (int i = 0; i < 2*n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int groupMax = 0;
        for(int i = 0; i < n; i++) {
            int groupSum = arr[i] + arr[2*n - 1 - i];
            if(groupSum > groupMax)
                // 최댓값 갱신
                groupMax = groupSum;
        }

        System.out.print(groupMax);

    }
}