import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        
        if(m >= 12 || m <= 2)
            System.out.println("Winter");
        else if(m <= 5)
            System.out.println("Spring");
        else if(m <= 8)
            System.out.println("Summer");
        else
            System.out.println("Fall");
    }
}