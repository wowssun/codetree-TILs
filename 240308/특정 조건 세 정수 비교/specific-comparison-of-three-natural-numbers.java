import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = a > b ? (b > c ? c : b) : (a < c ? a : c);

        if (a == min) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }

        System.out.print(a == b ? (b == c ? 1 : 0) : 0);
    }
}