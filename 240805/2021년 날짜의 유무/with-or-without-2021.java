import java.util.Scanner;

public class Main {

    public static boolean exist2021(int m, int d) {
        if (m < 13) {
            if (m == 2) {
                if (d < 29) {
                    return true;
                }
            } else if (m == 4 || m == 6 || m == 9 || m ==11){
                    if (d < 31) {
                        return true;
                    }
                } else {
                    if (d < 32) {
                        return true;
                    }
           }
            
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