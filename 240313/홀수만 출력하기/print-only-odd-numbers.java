import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int input = sc.nextInt();
            
            if (input % 2 != 0 && input % 3 == 0) {
                System.out.println(input);
            }
        }
    }
}