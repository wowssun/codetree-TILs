import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int q = sc.nextInt();
       int [] arr = new int[n+1];

       for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
       }

      for (int i = 1; i <= q; i++) {

        int input = sc.nextInt();

        if (input == 1) {
           int a = sc.nextInt();
            System.out.println(arr[a]);
           
        } else if (input == 2) {
            int b = sc.nextInt();
            int idx = 0;
            for (int j = 1; j <= n; j++) {
                if (arr[j] == b) {
                    idx = j;
                    break;
                }
            }     
            System.out.println(idx);     

        } else {
            int s = sc.nextInt();
            int e = sc.nextInt();

            for (int j = s; j <= e; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        
      }
       

    }
}