import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n+1];

        for (int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        while (true) {
             int maxIdx = 0;   // 최댓값 인덱스 ,첫 번째 

            for (int i = 0; i < n; i++) {
                if (arr[maxIdx] < arr[i]) {  // 최댓값 비교 인덱스 저장 
                    maxIdx = i;
                }
            }

            System.out.print((maxIdx + 1) + " "); // 해당 인덱스 출력 

            if (maxIdx == 0) {  // 인덱스가 첫 번째 원소가 되면 종료 
                break;
            }

            n = maxIdx;  // 반복 위치를 최댓값 인덱스 
            

        }

    }
}