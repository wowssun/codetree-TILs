import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = a >= b ? (b >= c ? c : b) : (a <= c ? a : c);

        System.out.println(min);
    }
}