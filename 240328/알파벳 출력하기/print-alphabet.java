import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char a = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                               
                if(a > 'Z'){
                    a = 'A';
                }

                System.out.print(a);
                a++;
                
            }
            System.out.println();
        }
    }
}