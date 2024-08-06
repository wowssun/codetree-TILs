import java.util.Scanner;

public class Main {

    public static boolean palindrome (String str) {
        String reverseStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        if (str.equals(reverseStr)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (palindrome(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}