import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String goal = sc.next();

        if (str.indexOf(goal) == -1) {
            System.out.print(-1);
        } else {
            System.out.print(str.indexOf(goal));
        }
    }
}