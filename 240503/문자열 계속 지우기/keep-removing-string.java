import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        while (true) {
           if (str1.indexOf(str2) == -1) {
                System.out.print(str1);
            break;
        } else {
            int idx = str1.indexOf(str2);
            int len2 = str2.length();
            str1 = str1.substring(0,idx) + str1.substring(idx+len2);
        }
        }


    }
}