import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int [] arr1 = new int[n1];
        int [] arr2 = new int[n2];
    
        // 수열 a
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // 수열 b
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // 수열 b의 0번째 자리와 수열 a의 원소를 순서대로 비교 
        for (int i = 0; i < n1; i++) {
            
            boolean result = true;

            for(int j = 0; j < n2; j++) {
                // arr1의 index가 범위 밖으로 벗어날때
                if(i + j >= n1) {
                    result = false;
                    break;
                }
                
                // arr1과 arr2가 일치하지 않을때
                if(arr1[i + j] != arr2[j]) {
                    result = false;
                    break;
                }
            }
            if(result) {
                System.out.print("Yes");
                System.exit(0);  // 시스템 강제종료 
            }
         }  
            System.out.print("No");
    }
}