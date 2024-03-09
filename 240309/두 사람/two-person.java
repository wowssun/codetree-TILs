import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1Age = sc.nextInt();
        String h1Gen = sc.next();

        int h2Age = sc.nextInt();
        String h2Gen = sc.next();

        if ((h1Age >= 19 || h2Age >= 19) && (h1Gen.equals("M") || h2Gen.equals("M"))){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
}
}