import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       if(n == 2)
            System.out.println("28");
        else if(n <= 7) {
            if(n % 2 == 1)
                System.out.println("31");
            else
                System.out.println("30");
        }
        else {
            if(n % 2 == 0)
                System.out.println("31");
            else
                System.out.println("30");
        }

    }
}