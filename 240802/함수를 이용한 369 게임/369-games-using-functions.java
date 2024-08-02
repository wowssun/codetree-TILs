import java.util.Scanner;

public class Main {
    public static boolean exist369(int n) {
        boolean result = false;
        while(n != 0){
            if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
                
                result = true;
                break;
            }
            n /= 10;
        }
        return result;
    }

    public static int multiple3(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || exist369(i)) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
    
        System.out.print(multiple3(a,b));
    }
}