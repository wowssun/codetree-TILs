import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int cnt = 0;
        int lenA = a.length();
        int lenB = b.length();

        for (int i = 0; i < lenA - 1; i++) {
            if (a.charAt(i) == b.charAt(0) && a.charAt(i+1) == b.charAt(1)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}