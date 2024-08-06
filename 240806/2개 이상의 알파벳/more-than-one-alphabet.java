import java.util.Scanner;

public class Main {

    public static boolean twiceAlphabet(String str) {
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) != str.charAt(i)) {
                cnt++;
            }

            if (cnt == 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (twiceAlphabet(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}