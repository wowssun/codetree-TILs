import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[100];
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == 0){
                break;
            }
            cnt++;
        }

        for (int j = cnt -3; j < cnt; j++){
            sum += arr[j];
        }
        System.out.print(sum);
    }
}