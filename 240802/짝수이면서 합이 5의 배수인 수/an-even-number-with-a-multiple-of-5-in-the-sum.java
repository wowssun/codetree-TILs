import java.util.Scanner;

public class Main {

    public static boolean yesNo(int n) {
        int sum = (n / 10) + (n % 10);
        return n % 2 == 0 && sum % 5 == 0;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (yesNo(n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}