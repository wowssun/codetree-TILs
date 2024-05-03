import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int idx = str.indexOf("e");

        if (idx != -1) {
            str = str.substring(0,idx) + str.substring(idx+1);
        }

        System.out.print(str);
    }
}