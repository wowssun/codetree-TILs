import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int q = sc.nextInt();
        int len = str.length();

        for (int i = 0; i < q; i++) {
            int input = sc.nextInt();

            if (input == 1) {
                str = str.substring(1) + str.substring(0,1);
                System.out.println(str);
            } else if (input == 2) {
                str = str.substring(len - 1) + str.substring(0, len - 1);
                System.out.println(str);
            } else {
                char [] arr = str.toCharArray();
                char tmp;
                for (int j = 0; j < len / 2; j++) {
                    tmp = arr[j];
                    arr[j] = arr[len - j - 1];
                    arr[len - j - 1] = tmp;
                }
                str = String.valueOf(arr);
                System.out.println(str);
            }
        }
    }
}