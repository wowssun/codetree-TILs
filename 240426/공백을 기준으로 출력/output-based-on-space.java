import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String new1 = str1.replace(" ", ""); 
        String new2 = str2.replace(" ", "");

        System.out.print(new1 + new2);
    }
}