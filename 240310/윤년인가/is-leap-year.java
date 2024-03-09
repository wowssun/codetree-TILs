import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if (y % 4 == 0){
            System.out.println("true");
            if (y == 100 && y != 400){
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }

    }
}