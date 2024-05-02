import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char [] arr = str.toCharArray();
        char one = arr[0];
        char two = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == two) {
                arr[i] = one;
            }
        }

        str = String.valueOf(arr);
        System.out.print(str);
    }
}