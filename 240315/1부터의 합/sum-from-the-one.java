import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= 100){
            sum += i;
            
            if (sum >= n){
                break;
            }

            i++;
        }
        System.out.print(i);

       
    }
}