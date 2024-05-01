import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       String str = "";

       for (int i = 0; i < n; i++) {
        str += sc.next();
       }

       int len = str.length();

       for (int i = 0; i < len; i++) {
        System.out.print(str.charAt(i));

        if ((i+1) % 5 == 0) {
            System.out.println();
        }
       } 
    }
}