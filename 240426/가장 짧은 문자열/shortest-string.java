import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int max = len1 > len2 ? (len1 > len3 ? len1 : len3) : (len2 > len3 ? len2 : len3);
        int min = len1 > len2 ? (len2 > len3 ? len3 : len2) : (len1 > len3 ? len3 : len1);

        System.out.print(max - min);
    }
}