import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int [] arr1 = new int[n1];
        int [] arr2 = new int[n2];
        int cnt = 0;
    
        // 수열 a
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // 수열 b
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // 수열 b의 0번째 자리와 수열 a의 원소를 순서대로 비교 
        for (int num : arr1) {
            if (num == arr2[cnt]) {
                cnt++;
                if (cnt == n2) {
                    System.out.print("Yes");
                    break;
                }
            } else {
                cnt = 0;  // 일치하지 않으면 cnt를 초기화
            }
        }

        if (cnt != n2) {
            System.out.print("No");
        }  
    }
}