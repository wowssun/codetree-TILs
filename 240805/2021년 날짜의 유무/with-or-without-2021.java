import java.util.Scanner;

public class Main {

    public static int lastDay(int m) {
        if(m == 2) {
            return 28;
        }
            
        if(m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }

        return 31;
    }

    public static boolean exist2021(int m, int d) {
        if(m <= 12 && d <= lastDay(m)) {
            return true;
        }
            
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        if (exist2021(month, day)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}