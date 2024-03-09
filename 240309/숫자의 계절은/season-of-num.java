import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        
        if (3 <= m && m <= 5){
            System.out.println("Spring");
        } else if (6 <= m && m <= 8) {
            System.out.println("Summer");
        } else if (9 <= m && m <= 11) {
            System.out.println("Fall");
        } else if (6 == 12 || m == 1 || m == 2) {
             System.out.println("Winter");
        }
    }
}