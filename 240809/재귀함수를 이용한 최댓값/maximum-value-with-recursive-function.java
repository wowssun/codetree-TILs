import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    
    public static int[] arr = new int[MAX_N];

    public static int maxNum(int n) {
       if(n == 0)
            return arr[0];
    
        return Math.max(maxNum(n - 1), arr[n]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(maxNum(n - 1));


    }
}