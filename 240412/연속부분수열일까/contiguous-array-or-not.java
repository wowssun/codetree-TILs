import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int [] arr1 = new int[n1];
        int [] arr2 = new int[n2];
        boolean result = false;
    
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
            if (arr1[i] == arr2[0]){  
                for (int j = 0; j < n2; j++) {
                    if (arr1[i] == arr2[j]){
                       result = true;
                       i++; 
                    } else {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    break;
                } 
            }
        }

        if (result) {
            System.out.print("Yes");
        } else {
            System.out.print("No");       
        }
    }
}