import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr = sc.next();

        int idx = arr.length() - 1;
        if (idx % 2 == 0) {
            idx--;
        }

        for (int i = idx; i >= 0; i-=2) {
            System.out.print(arr.charAt(i));
        }
    }
}