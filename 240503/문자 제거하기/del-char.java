import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int len = str.length();

        while (len > 1) {

            int n = sc.nextInt();
  
            if (n >= len) {
                str = str.substring(0,len-1);
            } else {
                str = str.substring(0,n) + str.substring(n+1);
            }
            System.out.println(str);  
            len = str.length();
        }
    }
}