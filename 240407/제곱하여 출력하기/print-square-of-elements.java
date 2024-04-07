import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();

            arr[i] = input * input;

        }

        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}