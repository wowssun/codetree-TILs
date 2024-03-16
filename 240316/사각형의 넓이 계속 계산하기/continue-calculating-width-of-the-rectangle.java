import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            String str = sc.next();

            System.out.println(w * h);

            if (str.equals("C")) {
                break;
            }

        }
    }
}