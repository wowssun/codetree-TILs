import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str1New = "";
        String str2New = "";

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                str1New += str1.charAt(i);
            } else {
                break;
            } 
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                str2New += str2.charAt(i);
            } else {
                break;
            } 
        }

        int str1Num = Integer.parseInt(str1New);
        int str2Num = Integer.parseInt(str2New);

        System.out.print(str1Num + str2Num);
        
    }
}