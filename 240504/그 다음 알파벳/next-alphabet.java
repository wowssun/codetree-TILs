import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char n = sc.next().charAt(0);

        if (n == 'z') {
            n = 'a';
        } else {
            n++;
        }
        
        System.out.print(n);
    }
}