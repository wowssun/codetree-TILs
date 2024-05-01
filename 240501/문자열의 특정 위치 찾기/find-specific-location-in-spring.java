import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String s = sc.next();

        if (str.indexOf(s) == -1) {
            System.out.print("No");
        } else {
            System.out.print(str.indexOf(s));
        }
    }
}