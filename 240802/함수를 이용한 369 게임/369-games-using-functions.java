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

    public static boolean multiple3(int n) {
       
        return n % 3 == 0 || exist369(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (multiple3(i)) {
                cnt++;
            }

        }
        System.out.print(cnt);
    }
}