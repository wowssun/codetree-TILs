import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        
       // 먼저 최저가격을 구하고 해당 인덱스 구함.
       int minVal = price[0];
       int minInx = 0;

       for (int i = 0; i < n; i++) {
        if (minVal > price[i]){
            minVal = price[i];
            minInx = i;
        }
       }

        // 최저부터 향후 이익을 구한다.
        int benefit = 0;
        for (int i = minInx; i < n; i++) {
           int gap = price[i] - minVal;

           if (gap > 0 && benefit < gap){
            benefit = gap;
           }
        }
        System.out.print(benefit);




       
    }
}