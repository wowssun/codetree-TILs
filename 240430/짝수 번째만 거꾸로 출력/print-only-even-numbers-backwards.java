import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr = sc.next();

        if (arr.length() % 2 == 0) {
            for (int i = arr.length() - 1; i >= 0; i-=2) {
                System.out.print(arr.charAt(i));
            }
        } else {
            for (int i = arr.length() - 2; i >= 0; i-=2) {
                System.out.print(arr.charAt(i));
            }
        }
    }
}