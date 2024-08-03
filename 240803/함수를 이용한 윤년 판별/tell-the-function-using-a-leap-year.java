import java.util.Scanner;

public class Main {

    public static boolean leapYear(int n) {
        if (n % 4 == 0 || n % 100 == 0 && n % 400 != 0){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int year = sc.nextInt();

       if (leapYear(year)){
        System.out.print("true");
       } else {
        System.out.print("false");
       }
    }
}