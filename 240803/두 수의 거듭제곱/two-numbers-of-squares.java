import java.util.Scanner;

public class Main {

    public static int invol(int a, int b) {
        int num = 1;
        for (int i = 0; i < b; i++) {
            num *= a;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(invol(a, b));
    }
}