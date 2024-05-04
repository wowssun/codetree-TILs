import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
         
        int lenA = a.length();
        int lenB = b.length();
        int cnt = 0;

        for (int i = 0; i < lenA; i++) {
            a = a.substring(1) + a.substring(0,1);
            cnt++;

            if (a.equals(b)) {
                System.out.print(cnt);
                break;
            } 
        }

        if (cnt == lenA) {
            System.out.print(-1);
        }
    }
}