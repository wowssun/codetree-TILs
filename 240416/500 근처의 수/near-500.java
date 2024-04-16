import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            if (arr[i] > 500 && minVal > arr[i]){ 
                minVal = arr[i];
            } 
            
            if (arr[i] < 500 && maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        System.out.print(maxVal + " " + minVal);








    }
}