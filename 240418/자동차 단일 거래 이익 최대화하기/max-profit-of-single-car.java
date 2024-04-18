import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        
       // 최저를 구하면 안되네 그럼 이중 for문으로 첫항과 그 다음항 계속 빼면서 
       // 0 보다 크면서 그 이익보다 더 값이 나가는 것으로 구해야 함.
       int minVal = price[0];
       int gap = 0;
       
       for (int i = 0; i < n-1; i++) {
        for (int j = i+1; j < n; j++) {
            if (price[j] > price[i]) {
                if(gap < (price[j] - price[i])){
                    gap = price[j] - price[i];
                }
            }
        }
       }
       System.out.print(gap);
    }
}