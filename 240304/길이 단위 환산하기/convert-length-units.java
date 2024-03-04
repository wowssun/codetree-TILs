import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       double ft = sc.nextDouble();
       
       double ftCm = 30.48 * ft;

    
       System.out.printf("%.1f", ftCm);
    }
}