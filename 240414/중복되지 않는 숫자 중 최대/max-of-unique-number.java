import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal = -1;  // 우선 max를 =1로 지정 

        for (int i = 0; i < n; i++) {
          if (maxVal < arr[i]) {       // -1과 원소를 비교한다. 
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {     // 비교한 원소가 더 큰 경우, 중복 확인 
                    cnt++;
                }
            }

            if (cnt == 1) {         // 위에서 구한 max가 중복이 없다면 
                maxVal = arr[i];    // 최댓값
            }                       // 만약 중복이 있다면 다시 maxVal = -1인 상태로 다음 원소와 비교 
          }
        }

        System.out.print(maxVal);
    }
}