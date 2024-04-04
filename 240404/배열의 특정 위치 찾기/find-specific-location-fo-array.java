import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];
         int sum = 0;
         double sum2= 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 1; j < 10; j+=2){
            sum += arr[j];
        }
        System.out.print(sum);

        for (int k = 2; k < 10; k+=3){
            sum2 += arr[k];
        }
        double avg = sum2 / 3;
        System.out.print(" " + avg);
    }
}