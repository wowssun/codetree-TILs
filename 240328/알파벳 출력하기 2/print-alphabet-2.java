import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char a = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i*2; j++) {
                System.out.print(" ");
            }

            for (int j = n-i; j > 0; j--) {
                System.out.print(a + " ");
                a++;

                if(a > 'Z') {
                    a = 'A';
                }
            }
            System.out.println();
        }
    }
}