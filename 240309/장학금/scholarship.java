import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int f = sc.nextInt();

        if (m < 90) {
            System.out.println(0);
        } else if (f >= 95) {
            System.out.println(100000);
        } else if (f >= 90) {
            System.out.println(50000);
        } else {
            System.out.println(0);
        }

    }
}